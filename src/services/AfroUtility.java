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
import com.codename1.ui.Tabs;
import com.codename1.ui.URLImage;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.GridLayout;
import com.parse4cn1.ParseException;
import com.parse4cn1.ParseFile;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author sandraarnolds
 */
public class AfroUtility {

    public static void setupTabs(Tabs tabs) {
        tabs.setSwipeActivated(false);
        tabs.getTabsContainer().setLayout(new GridLayout(1, tabs.getTabsContainer().getComponentCount()));
        tabs.getTabsContainer().setScrollableX(false);
    }

    public Image fetchUrlImage(String fileName, String url, String placeholderName) {

        Image image = null;
        try {
            InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/" + placeholderName);//TEMP
            EncodedImage placeHolder = EncodedImage.create(is);
            image = URLImage.createToStorage(placeHolder, fileName + "_" + url, url, URLImage.RESIZE_SCALE);
            Log.p("[AfroUtility->fetchUrlImage(..)] img h=" + image.getHeight() + ", w=" + image.getWidth(), Log.DEBUG);
            Log.p("[AfroUtility->fetchUrlImage(..)] " + url, Log.DEBUG);

        } catch (IOException ioe) {
            Log.p("[AfroUtility->fetchUrlImage(..)] ioe exception=" + ioe, Log.DEBUG);
        }
        return image;
    }

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

            imageObject = new Advert("", file, newUrl, "");

            Log.p("[Utility->uploadImage(..)] newUrl=" + newUrl, Log.DEBUG);

        } catch (ParseException e) {
            Log.p("", Log.DEBUG);
        } catch (IOException e) {
            Log.p("", Log.DEBUG);
        }

        return imageObject;
    }

}
