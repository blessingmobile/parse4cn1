/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.codename1.io.Log;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.Image;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.parse4cn1.ParseException;
import com.parse4cn1.ParseFile;
import java.io.IOException;

/**
 *
 * @author sandraarnolds
 */
public class AfroUtility {

    
    public static Advert openGallery() {
        
       
        
        return null;
    }

    public static Advert uploadImage(String picture) {
        Advert imageObject = null;
        String newUrl = "";
        try {
            //String picture = Capture.capturePhoto(1024, -1);
            Image raw_img = EncodedImage.createImage(picture);
            EncodedImage img = EncodedImage.createFromImage(raw_img, false);

            ParseFile file = new ParseFile("image.png", img.getImageData(), "image/png");
            file.save();

            String url = file.getUrl();
            int index = url.indexOf(":1337");
            String sub = url.substring(index);
            newUrl = "http://mfactory.dedicated.co.za" + sub;
            
            imageObject = new Advert(file, newUrl, "");
            
            Log.p("[Utility->uploadImage(..)] newUrl=" + newUrl, Log.DEBUG);

            
        } catch (ParseException e) {
            Log.p("", Log.DEBUG);
        } catch (IOException e) {
            Log.p("", Log.DEBUG);
        }

        return imageObject;
    }

}
