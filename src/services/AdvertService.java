/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.codename1.io.Log;
import com.parse4cn1.ParseException;
import com.parse4cn1.ParseFile;
import com.parse4cn1.ParseObject;
import com.parse4cn1.ParseQuery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sandraarnolds
 */
public class AdvertService {

    public static void createAdvert(String objectIdUser, String name, String clickUrl, String imageUrl, boolean isEnabled, ParseFile imageRaw) {
        try {
            ParseObject task = ParseObject.create("Advert");
            task.put("objectIdUser", objectIdUser);
            task.put("name", name);
            task.put("clickUrl", clickUrl);
            task.put("imageUrl", imageUrl);
            task.put("imageRaw", imageRaw);
            task.put("isEnabled", isEnabled);
            task.save();
        } catch (ParseException e) {
            Log.p("[ADsService->createAdvert(..)] ParseExceptoin " + e.getMessage(), Log.DEBUG);
        }
    }

    public static List<Advert> getEnabledAd() {
        List<Advert> adverts = new ArrayList<>();
        
        try {

            ParseQuery<ParseObject> query = ParseQuery.getQuery("Advert");
            //query.whereEqualTo("isEnabled", true);
            List<ParseObject> results = query.find();

            for (ParseObject advert : results) {
                String name = advert.getString("name");
                String imageUrl = advert.getString("imageUrl");
                String clickUrl = advert.getString("clickUrl");
                boolean isEnabled = advert.getBoolean("isEnabled");
                ParseFile file = advert.getParseFile("imageRaw");
                Advert advertObject = new Advert(name, file, imageUrl, clickUrl);
                advertObject.setObjectId(advert.getObjectId());
                advertObject.setParseObject(advert);
                advertObject.setIsEnabled(isEnabled);
                adverts.add(advertObject);
            }
        } catch (ParseException e) {
            Log.p("[ADsService->getEnabledAd()] ParseExceptoin " + e.getMessage(), Log.DEBUG);
        }

        return adverts;
    }

}
