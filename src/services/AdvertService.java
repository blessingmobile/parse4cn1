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

    public static Advert getEnabledAd() {
        Advert img = null;
        try {
            
            ParseQuery<ParseObject> query = ParseQuery.getQuery("Advert");
            query.whereEqualTo("isEnabled", false);
            List<ParseObject> results = query.find();
            ParseObject advert = results.get(0);
            String imageUrl = advert.getString("imageUrl");
            String clickUrl = advert.getString("clickUrl");
            ParseFile file = advert.getParseFile("imageRaw");
            img = new Advert(file, imageUrl, clickUrl);
            
        } catch (ParseException e) {
            Log.p("[ADsService->getEnabledAd()] ParseExceptoin " + e.getMessage(), Log.DEBUG);
        }
        
        return img;
    }

}
