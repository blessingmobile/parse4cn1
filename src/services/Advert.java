/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.parse4cn1.ParseFile;

/**
 *
 * @author sandraarnolds
 */
public class Advert {

    private ParseFile file;
    private String imageUrl;
    private String clickUrl;

    public Advert() {
    }

    public Advert(ParseFile file, String newUrl, String clickUrl) {
        this.file = file;
        this.imageUrl = newUrl;
        this.clickUrl = clickUrl;
    }

    public ParseFile getFile() {
        return file;
    }

    public void setFile(ParseFile file) {
        this.file = file;
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
