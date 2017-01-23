/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.ui.Image;
import com.parse4cn1.ParseObject;
import java.util.Hashtable;
import services.Advert;
import services.AfroUtility;

/**
 *
 * @author sandraarnolds
 */
public class RenderTransformer {

    public static Hashtable[] getPlayers(java.util.List<ParseObject> list) {
        Hashtable hashtable[] = new Hashtable[list.size()];
        AfroUtility utility = new AfroUtility();

        for (int i = 0; i < list.size(); i++) {

            ParseObject p = (ParseObject) list.get(i);

            //TODO change imageName to imgUrl
            Image img = utility.fetchUrlImage(p.get("name").toString(), p.get("imgName").toString(), "placeholderSquare.png");

            Hashtable hash = new Hashtable();

            //UI data
            hash.put("text", p.get("name").toString());
            hash.put("icon", img);

            //raw data
            hash.put("id", p.getObjectId());//TODO Parse getObjectId null ?
            hash.put("name", p.get("name"));
            hash.put("playerDescription", p.get("playerDescription"));
            hash.put("imgName", p.get("imgName"));
            hash.put("vidName", p.get("vidName"));
            hash.put("reactionName", p.get("reactionName"));
            hash.put("league", p.get("league"));
            hash.put("team", p.get("team"));
            hash.put("country", p.get("country"));
            hash.put("league", p.get("league"));
            hash.put("goals", p.get("goals"));
            hash.put("nationalCaps", p.get("nationalCaps"));
            hash.put("motm", p.get("motm"));
            hash.put("redCard", p.get("redCard"));
            hash.put("star", p.get("star"));
            hashtable[i] = hash;
            
        }

        return hashtable;
    }
    
        //Must create one for list of adverts
    public static Hashtable[] getAdverts(java.util.List<Advert> list) {
        Hashtable hashtable[] = new Hashtable[list.size()];
        AfroUtility utility = new AfroUtility();

        for(int i = 0; i < list.size(); i++){
            Advert advert = list.get(i);
            String name = advert.getName();
            String imgUrl = advert.getImageUrl();
            String clickUrl = advert.getClickUrl();
            String objectId = advert.getObjectId(); 
            boolean isEnabled = advert.isIsEnabled();
          
            Image img = utility.fetchUrlImage(name, imgUrl, "placeholder_ad.png");

            Hashtable hash = new Hashtable();
            //UI
            if(isEnabled == false){
                hash.put("text", name);
            }
            else{
                hash.put("text", name + " (ACTIVE)");
            }
            hash.put("icon", img);
            //Code
            hash.put("name", name);
            hash.put("clickUrl", clickUrl);
            hash.put("objectId", objectId);
            hash.put("advert", advert);
            hashtable[i] = hash;
        }

        return hashtable;
    }

    //Must create one for list of adverts
    public static Hashtable getAdvert(Advert advert) {

        AfroUtility utility = new AfroUtility();

        String name = advert.getName();
        String imgUrl = advert.getImageUrl();
        String clickUrl = advert.getClickUrl();
        String objectId = advert.getObjectId();
        Image img = utility.fetchUrlImage(name, imgUrl, "placeholder_ad.png");

        Hashtable hashtable = new Hashtable();
        //UI
        hashtable.put("text", name);
        hashtable.put("icon", img);
        
        hashtable.put("name", name);
        hashtable.put("clickUrl", clickUrl);
        hashtable.put("objectId", objectId);
        
        hashtable.put("advert", advert);

        return hashtable;
    }

}
