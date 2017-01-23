/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.parse4cn1.ParseFile;
import com.parse4cn1.ParseObject;

/**
 *
 * @author sandraarnolds
 */
public class Advert {

    private String objectId;
    private String name;
    private ParseFile file;
    private String imageUrl;
    private String clickUrl;
    private boolean isEnabled;
    private ParseObject parseObject;

    public Advert() {
    }

    public Advert(String name, ParseFile file, String newUrl, String clickUrl) {
        this.name = name;
        this.file = file;
        this.imageUrl = newUrl;
        this.clickUrl = clickUrl;
    }

    public boolean isIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public ParseObject getParseObject() {
        return parseObject;
    }

    public void setParseObject(ParseObject parseObject) {
        this.parseObject = parseObject;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
