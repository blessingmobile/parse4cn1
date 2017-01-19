/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.Log;
import com.codename1.io.NetworkManager;
import com.codename1.processing.Result;
import com.codename1.ui.Dialog;
import com.codename1.ui.List;
import com.codename1.util.StringUtil;
import com.parse4cn1.ParseException;
import com.parse4cn1.ParseFile;
import com.parse4cn1.ParseObject;
import com.parse4cn1.ParseQuery;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author sandraarnolds
 */
public class PlayerModel {

    public static ArrayList playerSearchTerm(String tag) {

        java.util.List<ParseObject> list = getPlayers();
        
        ArrayList filter = new ArrayList();

        String playerName;
        tag = tag.toLowerCase();

        for(int i = 0; i < list.size(); i++){
            
            ParseObject tempPlayer = (ParseObject)list.get(i);
            playerName = tempPlayer.get("name").toString();
            playerName = playerName.toLowerCase();
            
            
            
            if(playerName.indexOf(tag) > -1){
                
                filter.add(tempPlayer);
                
            }
            
            //System.out.println(a.indexOf(b));
            
        }

        return filter;

    }

    public static java.util.List<ParseObject> getPlayers() {

          java.util.List<ParseObject> results = null;
        try {
            
            ParseQuery<ParseObject> query = ParseQuery.getQuery("Player");
             results = query.find();
          
            
        } catch (ParseException e) {
            Log.p("[ADsService->getEnabledAd()] ParseExceptoin " + e.getMessage(), Log.DEBUG);
        }
        
        return results;
    }

    

        /*ArrayList players = new ArrayList();
         Hashtable hash = new Hashtable();

         hash = new Hashtable();

         hash.put("name", "Basem Morsi");
         hash.put("playerDescription", "o Basem Morsy Elkotb Abdalla is an Egyptian footballer who plays for Egyptian Premier League side Zamalek and the Egypt national team as a striker.");
         hash.put("imgName", "/Basem Morsi.jpg");
         hash.put("vidName", "euro2016.mp4");
         hash.put("reactionName", "good.mp4");
         hash.put("team", "Al Ahly SC");
         hash.put("country", "Egypt");
         hash.put("league", "Egytian Premier League");
         hash.put("goals", "11");
         hash.put("games", "32");
         hash.put("yellowCards", "3");
         hash.put("assists", "4");

         players.add(hash);

         hash = new Hashtable();
         hash.put("name", "Mohamed Koffi");
         hash.put("playerDescription", "Mohamed Koffi (born 30 December 1986) is an Ivory Coast-born Burkinabé footballer who plays for Al-Ettifaq on from loan Zamalek SC");
         hash.put("imgName", "/Mohamed-Koffi.jpg");
         hash.put("vidName", "euro2016.mp4");
         hash.put("reactionName", "good.mp4");
         hash.put("team", "Zamalek SC");
         hash.put("country", "Ivory Coast");
         hash.put("league", "Egytian Premier League");
         hash.put("goals", "2");
         hash.put("games", "32");
         hash.put("yellowCards", "6");
         hash.put("assists", "4");

         players.add(hash);

         hash = new Hashtable();
         hash.put("name", "Emeka Eze");
         hash.put("playerDescription", "Emeka Christian Eze is a Nigerian footballer who plays for Enugu Rangers as a midfielder");
         hash.put("imgName", "/Emeka Eze.jpg");
         hash.put("vidName", "euro2016.mp4");
         hash.put("reactionName", "good.mp4");
         hash.put("team", "Enugu Rangers");
         hash.put("country", "Nigeria");
         hash.put("league", "Nigerian Premier League");
         hash.put("goals", "8");
         hash.put("games", "24");
         hash.put("yellowCards", "1");
         hash.put("assists", "9");

         players.add(hash);

         hash = new Hashtable();
         hash.put("name", "Ahmed Musa");
         hash.put("playerDescription", "Ahmed Musa is a Nigerian professional footballer who plays as a forward for Leicester City and the Nigeria national team from Kano");
         hash.put("imgName", "/Ahmed Musa.jpg");
         hash.put("vidName", "euro2016.mp4");
         hash.put("reactionName", "good.mp4");
         hash.put("team", "Kano Pillars");
         hash.put("country", "Nigeria");
         hash.put("league", "Nigerian Premier League");
         hash.put("goals", "1");
         hash.put("games", "6");
         hash.put("yellowCards", "0");
         hash.put("assists", "3");

         players.add(hash);

         hash = new Hashtable();
         hash.put("name", "Keagan Dolly");
         hash.put("playerDescription", "Keagan Larenzo Dolly is a South African football player who plays as a midfielder for Mamelodi Sundowns in the Premier Soccer League.");
         hash.put("imgName", "/Keagan Dolly.jpg");
         hash.put("vidName", "euro2016.mp4");
         hash.put("reactionName", "good.mp4");
         hash.put("team", "Sundowns");
         hash.put("country", "South Africa");
         hash.put("league", "ABSA Premiership");
         hash.put("goals", "4");
         hash.put("games", "6");
         hash.put("yellowCards", "2");
         hash.put("assists", "6");

         players.add(hash);

         hash = new Hashtable();
         hash.put("name", "Oupa Manyisa");
         hash.put("playerDescription", "Is a South African football player who plays as a midfielder for Orlando Pirates in the Premier Soccer League and South Africa");
         hash.put("imgName", "/Oupa-Manyisa.jpg");
         hash.put("vidName", "euro2016.mp4");
         hash.put("reactionName", "good.mp4");
         hash.put("team", "Pirates");
         hash.put("country", "South Africa");
         hash.put("league", "ABSA Premiership");
         hash.put("goals", "5");
         hash.put("games", "21");
         hash.put("yellowCards", "6");
         hash.put("assists", "7");

         players.add(hash);

         return players;*/
    

    public static java.util.List<ParseObject> getPlayer(String name) {

        java.util.List<ParseObject> players = getPlayers();

        java.util.List<ParseObject> list = new ArrayList<ParseObject>();

        for (Object keyObject : players) {
            ParseObject key = (ParseObject) keyObject;
            String str = key.get("name").toString();

            str = str.toLowerCase();
            name = name.toLowerCase();
     
            
            
            if (str.indexOf(name)>-1) {
                list.add(key);
            } else {
                //no match
            }
        }

        if (name.length() == 0) {
            return players;
        } else {
            return list;
        }

    }

}
