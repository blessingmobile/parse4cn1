/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.parse4cn1.ParseException;
import com.parse4cn1.ParseObject;

/**
 *
 * @author sandraarnolds
 */
public class PlayerService {
    
    public void createTask(String userObjectId, String taskName, String taskDescription, String url) {
        try {
            ParseObject task = ParseObject.create("Task");
            task.put("userId", userObjectId);
            task.put("taskName", taskName);
            task.put("taskDescription", taskDescription);
            task.put("url", url);
            task.save();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
