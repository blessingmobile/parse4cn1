/*
 * Copyright 2015 Chidiebere Okwudire.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Original implementation adapted from Thiago Locatelli's Parse4J project
 * (see https://github.com/thiagolocatelli/parse4j)
 */

package com.parse4cn1.command;

import ca.weblite.codename1.json.JSONException;
import ca.weblite.codename1.json.JSONObject;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.parse4cn1.Parse;
import com.parse4cn1.ParseConstants;
import com.parse4cn1.ParseException;
import com.parse4cn1.util.Logger;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public abstract class ParseCommand {

    private static final Logger LOGGER = Logger.getInstance();
    private static final String REQUEST_BODY_KEY = "data";

    protected JSONObject data = new JSONObject();
    protected boolean addJson = true;

    abstract void setUpRequest(final ConnectionRequest request) throws ParseException;

    public ParseResponse perform() throws ParseException {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Data to be sent: " + data.toString());
        }

        long commandStart = System.currentTimeMillis();
        final ParseResponse response = new ParseResponse();
        ConnectionRequest request = getConnectionRequest(response);

        Iterator keys = data.keys();
        while (keys.hasNext()) {
            final String key = (String) keys.next();
            if (!REQUEST_BODY_KEY.equals(key)) {
                try {
                    request.addArgument(key, data.get(key).toString());
                } catch (JSONException ex) {
                    throw new ParseException("Error parsing key '" + key + "' in command data", ex);
                }
            }
        }

        setUpRequest(request);
        NetworkManager.getInstance().addToQueueAndWait(request);
        response.extractResponseData(request);
        long commandReceived = System.currentTimeMillis();

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("ParseCommand took " + (commandReceived - commandStart) + " milliseconds\n");
        }

        return response;
    }
    
    protected ConnectionRequest getConnectionRequest(final ParseResponse response) {
        ConnectionRequest request = new ConnectionRequest() {
 
            @Override
            protected void handleErrorResponseCode(int code, String message) {
                response.setStatusCode(code);
                response.setError(new ParseException(code, message));
            }

            @Override
            protected void handleException(Exception err) {
                response.setError(new ParseException(ParseException.CONNECTION_FAILED, err.getMessage()));
            }

            @Override
            protected void buildRequestBody(OutputStream os) throws IOException {
                if (data.has(REQUEST_BODY_KEY)) {
                    try {
                        os.write(data.get(REQUEST_BODY_KEY).toString().getBytes("UTF-8"));
                    } catch (JSONException ex) {
                        throw new IllegalArgumentException("Unable to read request body from json object. Error:" 
                                + ex.getMessage());
                    }
                } else {
                    super.buildRequestBody(os);
                }
            }
        };
        request.setReadResponseForErrors(true);
        return request;
    }

    protected void setupHeaders(ConnectionRequest connectionRequest, boolean addJson) throws ParseException {
        connectionRequest.addRequestHeader(ParseConstants.HEADER_APPLICATION_ID, Parse.getApplicationId());
        connectionRequest.addRequestHeader(ParseConstants.HEADER_REST_API_KEY, Parse.getRestAPIKey());
        if (addJson) {
            connectionRequest.addRequestHeader(ParseConstants.HEADER_CONTENT_TYPE, ParseConstants.CONTENT_TYPE_JSON);
        }

        if (data.has(ParseConstants.FIELD_SESSION_TOKEN)) {
            try {
                connectionRequest.addRequestHeader(ParseConstants.HEADER_SESSION_TOKEN,
                        data.getString(ParseConstants.FIELD_SESSION_TOKEN));
            } catch (JSONException ex) {
                throw new ParseException(ex);
            }
        }
    }

    static protected String getUrl(final String endPoint, final String objectId) {
        String url = Parse.getParseAPIUrl(endPoint) + (objectId != null ? "/" + objectId : "");

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Request URL: " + url);
        }

        return url;
    }

    public void setData(JSONObject data) throws JSONException {
        this.data.put(REQUEST_BODY_KEY, data);
    }

    public void put(String key, String value) throws JSONException {
        this.data.put(key, value);
    }

//    public void put(String key, int value) throws JSONException {
//        this.data.put(key, value);
//    }
//
//    public void put(String key, long value) throws JSONException {
//        this.data.put(key, value);
//    }
//
//    public void put(String key, JSONObject value) throws JSONException {
//        this.data.put(key, value);
//    }
//
//    public void put(String key, JSONArray value) throws JSONException {
//        this.data.put(key, value);
//    }
}
