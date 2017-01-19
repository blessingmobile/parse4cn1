/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.messaging.Message;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;

/**
 *
 * @author sandraarnolds
 */
public class AfroSoccerUtility {

    public static void networkError() {
        if (Dialog.show("Error", "Connection issue. Please ensure that you have internet connectivity and re-connect by closing restarting app. If problem persists please click on contact support", "Contact Support", "Exit App")) {
            Message m = new Message("");
            Display.getInstance().sendMessage(new String[]{"support@afrosoccer99.com"}, "Afro Soccer App Connection Issues", m);
        }
        else{
            Display.getInstance().exitApplication();
        }
    }
}
