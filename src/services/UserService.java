/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.codename1.io.Log;
import com.parse4cn1.ParseException;
import com.parse4cn1.ParseUser;

/**
 *
 * @author sandraarnolds
 */
public class UserService {
        public void userRegistration(String email, String password) {
        //userRegistration("blessing@mfactory.mobi", "12345");
        try {
            ParseUser user = ParseUser.create(email, password);
            user.put("email", email);
            user.signUp();
            Log.p("The user with email: " + email + " created.", Log.DEBUG);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static ParseUser userLogin(String email, String password) {
        //userLogin("blessing@mfactory.mobi", "12345");
        //TODO ParseException [code=101, msg=Invalid username/password., cause=null]
        ParseUser user = null;
        try {
            user = ParseUser.create(email, password);
            user.login();
            final String sessionToken = user.getSessionToken();
            //Log.p("The user with email: " + email + " signed in with session " + sessionToken, Log.DEBUG);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void userLogout() {
        //blessing@mfactory.mobi
        try {
            ParseUser user = ParseUser.getCurrent();

            String email = user.getEmail();
            user.logout();
            Log.p("The user with email: " + email + " logged out", Log.DEBUG);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public boolean userIsEmailVerified(ParseUser user) {
        //blessing@mfactory.mobi

        // If email verification is enabled, verification email is sent and the emailVerified field is automatically created
        boolean emailVerified = user.getBoolean("emailVerified");

        return emailVerified;
    }

    public void userPasswordReset(String email) {

        try {
            ParseUser.requestPasswordReset(email);

            Log.p("The user with email: " + email + " reset password request sent", Log.DEBUG);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public ParseUser getUserById(String objectId) {
        //"5tAbJ4hh2U"
        ParseUser userById = null;
        try {//TODO check why email is not returned
            userById = ParseUser.fetch("_User", objectId);
            String username = userById.getUsername();
            Log.p("The user with username: " + username + " found", Log.DEBUG);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return userById;
    }
}
