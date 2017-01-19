/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        UIBuilder.registerCustomComponent("ShareButton", com.codename1.components.ShareButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Home";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        UIBuilder.registerCustomComponent("ShareButton", com.codename1.components.ShareButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Home");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findLabel55(Component root) {
        return (com.codename1.ui.Label)findByName("Label55", root);
    }

    public com.codename1.ui.Label findLabel55() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label55", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label55", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel51(Component root) {
        return (com.codename1.ui.Label)findByName("Label51", root);
    }

    public com.codename1.ui.Label findLabel51() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label51", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label51", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel52(Component root) {
        return (com.codename1.ui.Label)findByName("Label52", root);
    }

    public com.codename1.ui.Label findLabel52() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label52", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label52", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel53(Component root) {
        return (com.codename1.ui.Label)findByName("Label53", root);
    }

    public com.codename1.ui.Label findLabel53() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label53", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label53", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel54(Component root) {
        return (com.codename1.ui.Label)findByName("Label54", root);
    }

    public com.codename1.ui.Label findLabel54() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label54", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label54", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContProfilePlayerPic(Component root) {
        return (com.codename1.ui.Container)findByName("ContProfilePlayerPic", root);
    }

    public com.codename1.ui.Container findContProfilePlayerPic() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContProfilePlayerPic", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContProfilePlayerPic", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.ShareButton findLine3Share(Component root) {
        return (com.codename1.components.ShareButton)findByName("line3Share", root);
    }

    public com.codename1.components.ShareButton findLine3Share() {
        com.codename1.components.ShareButton cmp = (com.codename1.components.ShareButton)findByName("line3Share", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.ShareButton)findByName("line3Share", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLine1Img(Component root) {
        return (com.codename1.ui.Label)findByName("line1Img", root);
    }

    public com.codename1.ui.Label findLine1Img() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("line1Img", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("line1Img", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblVideoNum(Component root) {
        return (com.codename1.ui.Label)findByName("lblVideoNum", root);
    }

    public com.codename1.ui.Label findLblVideoNum() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblVideoNum", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblVideoNum", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContVideoText(Component root) {
        return (com.codename1.ui.Container)findByName("contVideoText", root);
    }

    public com.codename1.ui.Container findContVideoText() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("contVideoText", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("contVideoText", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblPlayerName(Component root) {
        return (com.codename1.ui.Label)findByName("lblPlayerName", root);
    }

    public com.codename1.ui.Label findLblPlayerName() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblPlayerName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblPlayerName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbTeam(Component root) {
        return (com.codename1.ui.ComboBox)findByName("cmbTeam", root);
    }

    public com.codename1.ui.ComboBox findCmbTeam() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("cmbTeam", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("cmbTeam", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.ShareButton findLine1Share(Component root) {
        return (com.codename1.components.ShareButton)findByName("line1Share", root);
    }

    public com.codename1.components.ShareButton findLine1Share() {
        com.codename1.components.ShareButton cmp = (com.codename1.components.ShareButton)findByName("line1Share", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.ShareButton)findByName("line1Share", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblGoals(Component root) {
        return (com.codename1.ui.Label)findByName("lblGoals", root);
    }

    public com.codename1.ui.Label findLblGoals() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblGoals", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblGoals", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblLeague(Component root) {
        return (com.codename1.ui.Label)findByName("lblLeague", root);
    }

    public com.codename1.ui.Label findLblLeague() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblLeague", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblLeague", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox", root);
    }

    public com.codename1.ui.ComboBox findComboBox() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerSearch(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerSearch", root);
    }

    public com.codename1.ui.Container findContainerSearch() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerSearch", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerSearch", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblGames(Component root) {
        return (com.codename1.ui.Label)findByName("lblGames", root);
    }

    public com.codename1.ui.Label findLblGames() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblGames", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblGames", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtVidSearch(Component root) {
        return (com.codename1.ui.TextField)findByName("txtVidSearch", root);
    }

    public com.codename1.ui.TextField findTxtVidSearch() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtVidSearch", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtVidSearch", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findLblDescription(Component root) {
        return (com.codename1.components.SpanLabel)findByName("lblDescription", root);
    }

    public com.codename1.components.SpanLabel findLblDescription() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("lblDescription", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("lblDescription", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbCountry(Component root) {
        return (com.codename1.ui.ComboBox)findByName("cmbCountry", root);
    }

    public com.codename1.ui.ComboBox findCmbCountry() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("cmbCountry", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("cmbCountry", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerAbout(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerAbout", root);
    }

    public com.codename1.ui.Container findContainerAbout() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerAbout", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerAbout", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findResult3(Component root) {
        return (com.codename1.ui.Container)findByName("Result3", root);
    }

    public com.codename1.ui.Container findResult3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Result3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Result3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findResult2(Component root) {
        return (com.codename1.ui.Container)findByName("Result2", root);
    }

    public com.codename1.ui.Container findResult2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Result2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Result2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerHome(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerHome", root);
    }

    public com.codename1.ui.Container findContainerHome() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerHome", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerHome", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findResult1(Component root) {
        return (com.codename1.ui.Container)findByName("Result1", root);
    }

    public com.codename1.ui.Container findResult1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Result1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Result1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnYes(Component root) {
        return (com.codename1.ui.Button)findByName("btnYes", root);
    }

    public com.codename1.ui.Button findBtnYes() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnYes", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnYes", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblIcon(Component root) {
        return (com.codename1.ui.Label)findByName("lblIcon", root);
    }

    public com.codename1.ui.Label findLblIcon() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblIcon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblIcon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContVideoItem(Component root) {
        return (com.codename1.ui.Container)findByName("ContVideoItem", root);
    }

    public com.codename1.ui.Container findContVideoItem() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContVideoItem", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContVideoItem", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTabVideo(Component root) {
        return (com.codename1.ui.Container)findByName("TabVideo", root);
    }

    public com.codename1.ui.Container findTabVideo() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("TabVideo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("TabVideo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblTeam(Component root) {
        return (com.codename1.ui.Label)findByName("lblTeam", root);
    }

    public com.codename1.ui.Label findLblTeam() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblTeam", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblTeam", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField2(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField2", root);
    }

    public com.codename1.ui.TextField findTextField2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField1(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField1", root);
    }

    public com.codename1.ui.TextField findTextField1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtVidSearch1(Component root) {
        return (com.codename1.ui.TextField)findByName("txtVidSearch1", root);
    }

    public com.codename1.ui.TextField findTxtVidSearch1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtVidSearch1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtVidSearch1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLine3Img(Component root) {
        return (com.codename1.ui.Label)findByName("line3Img", root);
    }

    public com.codename1.ui.Label findLine3Img() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("line3Img", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("line3Img", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnLine3(Component root) {
        return (com.codename1.ui.Button)findByName("btnLine3", root);
    }

    public com.codename1.ui.Button findBtnLine3() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnLine3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnLine3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnLine2(Component root) {
        return (com.codename1.ui.Button)findByName("btnLine2", root);
    }

    public com.codename1.ui.Button findBtnLine2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnLine2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnLine2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnLine1(Component root) {
        return (com.codename1.ui.Button)findByName("btnLine1", root);
    }

    public com.codename1.ui.Button findBtnLine1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnLine1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnLine1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox2(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox2", root);
    }

    public com.codename1.ui.ComboBox findComboBox2() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox1(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox1", root);
    }

    public com.codename1.ui.ComboBox findComboBox1() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox3(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox3", root);
    }

    public com.codename1.ui.ComboBox findComboBox3() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel23(Component root) {
        return (com.codename1.ui.Label)findByName("Label23", root);
    }

    public com.codename1.ui.Label findLabel23() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label23", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label23", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbLeague(Component root) {
        return (com.codename1.ui.ComboBox)findByName("cmbLeague", root);
    }

    public com.codename1.ui.ComboBox findCmbLeague() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("cmbLeague", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("cmbLeague", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerMain(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerMain", root);
    }

    public com.codename1.ui.Container findContainerMain() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerMain", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerMain", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContPlayerVideo(Component root) {
        return (com.codename1.ui.Container)findByName("contPlayerVideo", root);
    }

    public com.codename1.ui.Container findContPlayerVideo() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("contPlayerVideo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("contPlayerVideo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblVideoSearchQuery(Component root) {
        return (com.codename1.ui.Label)findByName("lblVideoSearchQuery", root);
    }

    public com.codename1.ui.Label findLblVideoSearchQuery() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblVideoSearchQuery", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblVideoSearchQuery", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findBanner(Component root) {
        return (com.codename1.ui.Container)findByName("Banner", root);
    }

    public com.codename1.ui.Container findBanner() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Banner", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Banner", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel21(Component root) {
        return (com.codename1.ui.Label)findByName("Label21", root);
    }

    public com.codename1.ui.Label findLabel21() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label21", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label21", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel27(Component root) {
        return (com.codename1.ui.Label)findByName("Label27", root);
    }

    public com.codename1.ui.Label findLabel27() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label27", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label27", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel28(Component root) {
        return (com.codename1.ui.Label)findByName("Label28", root);
    }

    public com.codename1.ui.Label findLabel28() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label28", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label28", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPhoneNumber(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPhoneNumber", root);
    }

    public com.codename1.ui.TextField findTxtPhoneNumber() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPhoneNumber", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPhoneNumber", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtFullName(Component root) {
        return (com.codename1.ui.TextField)findByName("txtFullName", root);
    }

    public com.codename1.ui.TextField findTxtFullName() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtFullName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtFullName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnPlayerVid(Component root) {
        return (com.codename1.ui.Button)findByName("btnPlayerVid", root);
    }

    public com.codename1.ui.Button findBtnPlayerVid() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnPlayerVid", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnPlayerVid", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.ShareButton findLine2Share(Component root) {
        return (com.codename1.components.ShareButton)findByName("line2Share", root);
    }

    public com.codename1.components.ShareButton findLine2Share() {
        com.codename1.components.ShareButton cmp = (com.codename1.components.ShareButton)findByName("line2Share", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.ShareButton)findByName("line2Share", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblTitle(Component root) {
        return (com.codename1.ui.Label)findByName("lblTitle", root);
    }

    public com.codename1.ui.Label findLblTitle() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblTitle", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblTitle", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblCountry(Component root) {
        return (com.codename1.ui.Label)findByName("lblCountry", root);
    }

    public com.codename1.ui.Label findLblCountry() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblCountry", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblCountry", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblYellowCards(Component root) {
        return (com.codename1.ui.Label)findByName("lblYellowCards", root);
    }

    public com.codename1.ui.Label findLblYellowCards() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblYellowCards", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblYellowCards", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer19(Component root) {
        return (com.codename1.ui.Container)findByName("Container19", root);
    }

    public com.codename1.ui.Container findContainer19() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container19", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container19", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel12(Component root) {
        return (com.codename1.ui.Label)findByName("Label12", root);
    }

    public com.codename1.ui.Label findLabel12() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButtonTop(Component root) {
        return (com.codename1.ui.Button)findByName("ButtonTop", root);
    }

    public com.codename1.ui.Button findButtonTop() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("ButtonTop", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("ButtonTop", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer18(Component root) {
        return (com.codename1.ui.Container)findByName("Container18", root);
    }

    public com.codename1.ui.Container findContainer18() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container18", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container18", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel13(Component root) {
        return (com.codename1.ui.Label)findByName("Label13", root);
    }

    public com.codename1.ui.Label findLabel13() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer9(Component root) {
        return (com.codename1.ui.Container)findByName("Container9", root);
    }

    public com.codename1.ui.Container findContainer9() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel14(Component root) {
        return (com.codename1.ui.Label)findByName("Label14", root);
    }

    public com.codename1.ui.Label findLabel14() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel10(Component root) {
        return (com.codename1.ui.Label)findByName("Label10", root);
    }

    public com.codename1.ui.Label findLabel10() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel19(Component root) {
        return (com.codename1.ui.Label)findByName("Label19", root);
    }

    public com.codename1.ui.Label findLabel19() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label19", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label19", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer11(Component root) {
        return (com.codename1.ui.Container)findByName("Container11", root);
    }

    public com.codename1.ui.Container findContainer11() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer10(Component root) {
        return (com.codename1.ui.Container)findByName("Container10", root);
    }

    public com.codename1.ui.Container findContainer10() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLine1Title(Component root) {
        return (com.codename1.ui.Label)findByName("line1Title", root);
    }

    public com.codename1.ui.Label findLine1Title() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("line1Title", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("line1Title", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer13(Component root) {
        return (com.codename1.ui.Container)findByName("Container13", root);
    }

    public com.codename1.ui.Container findContainer13() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer12(Component root) {
        return (com.codename1.ui.Container)findByName("Container12", root);
    }

    public com.codename1.ui.Container findContainer12() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer7(Component root) {
        return (com.codename1.ui.Container)findByName("Container7", root);
    }

    public com.codename1.ui.Container findContainer7() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel15(Component root) {
        return (com.codename1.ui.Label)findByName("Label15", root);
    }

    public com.codename1.ui.Label findLabel15() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label15", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label15", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer15(Component root) {
        return (com.codename1.ui.Container)findByName("Container15", root);
    }

    public com.codename1.ui.Container findContainer15() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container15", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container15", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer14(Component root) {
        return (com.codename1.ui.Container)findByName("Container14", root);
    }

    public com.codename1.ui.Container findContainer14() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer8(Component root) {
        return (com.codename1.ui.Container)findByName("Container8", root);
    }

    public com.codename1.ui.Container findContainer8() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel16(Component root) {
        return (com.codename1.ui.Label)findByName("Label16", root);
    }

    public com.codename1.ui.Label findLabel16() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label16", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label16", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTxtComment(Component root) {
        return (com.codename1.ui.TextArea)findByName("txtComment", root);
    }

    public com.codename1.ui.TextArea findTxtComment() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("txtComment", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("txtComment", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel17(Component root) {
        return (com.codename1.ui.Label)findByName("Label17", root);
    }

    public com.codename1.ui.Label findLabel17() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label17", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label17", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer17(Component root) {
        return (com.codename1.ui.Container)findByName("Container17", root);
    }

    public com.codename1.ui.Container findContainer17() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container17", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container17", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer6(Component root) {
        return (com.codename1.ui.Container)findByName("Container6", root);
    }

    public com.codename1.ui.Container findContainer6() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer16(Component root) {
        return (com.codename1.ui.Container)findByName("Container16", root);
    }

    public com.codename1.ui.Container findContainer16() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container16", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container16", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel18(Component root) {
        return (com.codename1.ui.Label)findByName("Label18", root);
    }

    public com.codename1.ui.Label findLabel18() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label18", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label18", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findBLANK1(Component root) {
        return (com.codename1.ui.Container)findByName("BLANK1", root);
    }

    public com.codename1.ui.Container findBLANK1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("BLANK1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("BLANK1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findBLANK2(Component root) {
        return (com.codename1.ui.Container)findByName("BLANK2", root);
    }

    public com.codename1.ui.Container findBLANK2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("BLANK2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("BLANK2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer20(Component root) {
        return (com.codename1.ui.Container)findByName("Container20", root);
    }

    public com.codename1.ui.Container findContainer20() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container20", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container20", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContReactions(Component root) {
        return (com.codename1.ui.Container)findByName("contReactions", root);
    }

    public com.codename1.ui.Container findContReactions() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("contReactions", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("contReactions", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField", root);
    }

    public com.codename1.ui.TextField findTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContPlayerProfile(Component root) {
        return (com.codename1.ui.Container)findByName("ContPlayerProfile", root);
    }

    public com.codename1.ui.Container findContPlayerProfile() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContPlayerProfile", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContPlayerProfile", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerSearch1(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerSearch1", root);
    }

    public com.codename1.ui.Container findContainerSearch1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerSearch1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerSearch1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLine3Title(Component root) {
        return (com.codename1.ui.Label)findByName("line3Title", root);
    }

    public com.codename1.ui.Label findLine3Title() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("line3Title", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("line3Title", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnNo(Component root) {
        return (com.codename1.ui.Button)findByName("btnNo", root);
    }

    public com.codename1.ui.Button findBtnNo() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnNo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnNo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer22(Component root) {
        return (com.codename1.ui.Container)findByName("Container22", root);
    }

    public com.codename1.ui.Container findContainer22() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container22", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container22", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer21(Component root) {
        return (com.codename1.ui.Container)findByName("Container21", root);
    }

    public com.codename1.ui.Container findContainer21() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container21", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container21", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer24(Component root) {
        return (com.codename1.ui.Container)findByName("Container24", root);
    }

    public com.codename1.ui.Container findContainer24() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container24", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container24", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer23(Component root) {
        return (com.codename1.ui.Container)findByName("Container23", root);
    }

    public com.codename1.ui.Container findContainer23() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container23", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container23", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer26(Component root) {
        return (com.codename1.ui.Container)findByName("Container26", root);
    }

    public com.codename1.ui.Container findContainer26() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container26", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container26", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer25(Component root) {
        return (com.codename1.ui.Container)findByName("Container25", root);
    }

    public com.codename1.ui.Container findContainer25() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container25", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container25", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer28(Component root) {
        return (com.codename1.ui.Container)findByName("Container28", root);
    }

    public com.codename1.ui.Container findContainer28() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container28", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container28", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer27(Component root) {
        return (com.codename1.ui.Container)findByName("Container27", root);
    }

    public com.codename1.ui.Container findContainer27() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container27", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container27", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findVideo(Component root) {
        return (com.codename1.ui.Button)findByName("Video", root);
    }

    public com.codename1.ui.Button findVideo() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Video", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Video", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContProfiles(Component root) {
        return (com.codename1.ui.Container)findByName("contProfiles", root);
    }

    public com.codename1.ui.Container findContProfiles() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("contProfiles", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("contProfiles", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton5(Component root) {
        return (com.codename1.ui.Button)findByName("Button5", root);
    }

    public com.codename1.ui.Button findButton5() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton3(Component root) {
        return (com.codename1.ui.Button)findByName("Button3", root);
    }

    public com.codename1.ui.Button findButton3() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton7(Component root) {
        return (com.codename1.ui.Button)findByName("Button7", root);
    }

    public com.codename1.ui.Button findButton7() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton6(Component root) {
        return (com.codename1.ui.Button)findByName("Button6", root);
    }

    public com.codename1.ui.Button findButton6() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerVideos(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerVideos", root);
    }

    public com.codename1.ui.Container findContainerVideos() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerVideos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerVideos", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.ShareButton findShareButton2(Component root) {
        return (com.codename1.components.ShareButton)findByName("ShareButton2", root);
    }

    public com.codename1.components.ShareButton findShareButton2() {
        com.codename1.components.ShareButton cmp = (com.codename1.components.ShareButton)findByName("ShareButton2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.ShareButton)findByName("ShareButton2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.ShareButton findShareButton3(Component root) {
        return (com.codename1.components.ShareButton)findByName("ShareButton3", root);
    }

    public com.codename1.components.ShareButton findShareButton3() {
        com.codename1.components.ShareButton cmp = (com.codename1.components.ShareButton)findByName("ShareButton3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.ShareButton)findByName("ShareButton3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerResults(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerResults", root);
    }

    public com.codename1.ui.Container findContainerResults() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerResults", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerResults", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerMessages(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerMessages", root);
    }

    public com.codename1.ui.Container findContainerMessages() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerMessages", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerMessages", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblPlayerTitle(Component root) {
        return (com.codename1.ui.Label)findByName("lblPlayerTitle", root);
    }

    public com.codename1.ui.Label findLblPlayerTitle() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblPlayerTitle", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblPlayerTitle", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel9(Component root) {
        return (com.codename1.ui.Label)findByName("Label9", root);
    }

    public com.codename1.ui.Label findLabel9() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findCmbPlayers(Component root) {
        return (com.codename1.ui.ComboBox)findByName("cmbPlayers", root);
    }

    public com.codename1.ui.ComboBox findCmbPlayers() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("cmbPlayers", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("cmbPlayers", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel8(Component root) {
        return (com.codename1.ui.Label)findByName("Label8", root);
    }

    public com.codename1.ui.Label findLabel8() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel7(Component root) {
        return (com.codename1.ui.Label)findByName("Label7", root);
    }

    public com.codename1.ui.Label findLabel7() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findSearch1(Component root) {
        return (com.codename1.ui.Container)findByName("Search1", root);
    }

    public com.codename1.ui.Container findSearch1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Search1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Search1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBrtnSearchButton1(Component root) {
        return (com.codename1.ui.Button)findByName("brtnSearchButton1", root);
    }

    public com.codename1.ui.Button findBrtnSearchButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("brtnSearchButton1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("brtnSearchButton1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs2(Component root) {
        return (com.codename1.ui.Tabs)findByName("tabs2", root);
    }

    public com.codename1.ui.Tabs findTabs2() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("tabs2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("tabs2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel62(Component root) {
        return (com.codename1.ui.Label)findByName("Label62", root);
    }

    public com.codename1.ui.Label findLabel62() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label62", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label62", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel63(Component root) {
        return (com.codename1.ui.Label)findByName("Label63", root);
    }

    public com.codename1.ui.Label findLabel63() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label63", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label63", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtEmail(Component root) {
        return (com.codename1.ui.TextField)findByName("txtEmail", root);
    }

    public com.codename1.ui.TextField findTxtEmail() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtEmail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtEmail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel131(Component root) {
        return (com.codename1.ui.Label)findByName("Label131", root);
    }

    public com.codename1.ui.Label findLabel131() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label131", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label131", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLine2Img(Component root) {
        return (com.codename1.ui.Label)findByName("line2Img", root);
    }

    public com.codename1.ui.Label findLine2Img() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("line2Img", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("line2Img", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnSearchVid(Component root) {
        return (com.codename1.ui.Button)findByName("btnSearchVid", root);
    }

    public com.codename1.ui.Button findBtnSearchVid() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnSearchVid", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnSearchVid", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findVideoItem(Component root) {
        return (com.codename1.ui.Container)findByName("VideoItem", root);
    }

    public com.codename1.ui.Container findVideoItem() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("VideoItem", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("VideoItem", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblAssists(Component root) {
        return (com.codename1.ui.Label)findByName("lblAssists", root);
    }

    public com.codename1.ui.Label findLblAssists() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblAssists", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblAssists", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findBLANK(Component root) {
        return (com.codename1.ui.Container)findByName("BLANK", root);
    }

    public com.codename1.ui.Container findBLANK() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("BLANK", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("BLANK", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel1", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContVideos(Component root) {
        return (com.codename1.ui.Container)findByName("contVideos", root);
    }

    public com.codename1.ui.Container findContVideos() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("contVideos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("contVideos", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel61(Component root) {
        return (com.codename1.ui.Label)findByName("Label61", root);
    }

    public com.codename1.ui.Label findLabel61() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label61", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label61", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.ShareButton findShareButtonSocial(Component root) {
        return (com.codename1.components.ShareButton)findByName("shareButtonSocial", root);
    }

    public com.codename1.components.ShareButton findShareButtonSocial() {
        com.codename1.components.ShareButton cmp = (com.codename1.components.ShareButton)findByName("shareButtonSocial", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.ShareButton)findByName("shareButtonSocial", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel2(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel2", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel2() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLine1(Component root) {
        return (com.codename1.ui.Container)findByName("Line1", root);
    }

    public com.codename1.ui.Container findLine1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Line1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Line1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLine2Title(Component root) {
        return (com.codename1.ui.Label)findByName("line2Title", root);
    }

    public com.codename1.ui.Label findLine2Title() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("line2Title", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("line2Title", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel3(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel3", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel3() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnSubmit(Component root) {
        return (com.codename1.ui.Button)findByName("btnSubmit", root);
    }

    public com.codename1.ui.Button findBtnSubmit() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnSubmit", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnSubmit", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLine2(Component root) {
        return (com.codename1.ui.Container)findByName("Line2", root);
    }

    public com.codename1.ui.Container findLine2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Line2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Line2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel4(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel4", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel4() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_HomeTagSearch = 20;
    public static final int COMMAND_HomeHome = 11;
    public static final int COMMAND_LoginRegistration = 2;
    public static final int COMMAND_HomeInformation = 14;
    public static final int COMMAND_HomeSearch = 9;
    public static final int COMMAND_HomeVideo = 13;
    public static final int COMMAND_HomeContact = 15;
    public static final int COMMAND_HomePlayerSearch = 12;
    public static final int COMMAND_HomeCommand23 = 23;
    public static final int COMMAND_HomeCommand22 = 22;
    public static final int COMMAND_RegisterRegister = 3;
    public static final int COMMAND_Home = 19;
    public static final int COMMAND_HomeSubmit = 1;

    protected boolean onHomeTagSearch() {
        return false;
    }

    protected boolean onHomeHome() {
        return false;
    }

    protected boolean onLoginRegistration() {
        return false;
    }

    protected boolean onHomeInformation() {
        return false;
    }

    protected boolean onHomeSearch() {
        return false;
    }

    protected boolean onHomeVideo() {
        return false;
    }

    protected boolean onHomeContact() {
        return false;
    }

    protected boolean onHomePlayerSearch() {
        return false;
    }

    protected boolean onHomeCommand23() {
        return false;
    }

    protected boolean onHomeCommand22() {
        return false;
    }

    protected boolean onRegisterRegister() {
        return false;
    }

    protected boolean onHome() {
        return false;
    }

    protected boolean onHomeSubmit() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_HomeTagSearch:
                if(onHomeTagSearch()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeHome:
                if(onHomeHome()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_LoginRegistration:
                if(onLoginRegistration()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeInformation:
                if(onHomeInformation()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeSearch:
                if(onHomeSearch()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeVideo:
                if(onHomeVideo()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeContact:
                if(onHomeContact()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomePlayerSearch:
                if(onHomePlayerSearch()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeCommand23:
                if(onHomeCommand23()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeCommand22:
                if(onHomeCommand22()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_RegisterRegister:
                if(onRegisterRegister()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_Home:
                if(onHome()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeSubmit:
                if(onHomeSubmit()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("DialogCustom".equals(f.getName())) {
            exitDialogCustom(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(f.getName())) {
            exitPlayerProfile(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            exitLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(f.getName())) {
            exitTabSearch(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(f.getName())) {
            exitContVideoItem(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(f.getName())) {
            exitDialogTest(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            exitRegister(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            exitSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(f.getName())) {
            exitTabs1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(f.getName())) {
            exitSearch2Result(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(f.getName())) {
            exitPlayVideoScreen(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            exitHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(f.getName())) {
            exitSearch1(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitDialogCustom(Form f) {
    }


    protected void exitPlayerProfile(Form f) {
    }


    protected void exitLogin(Form f) {
    }


    protected void exitTabSearch(Form f) {
    }


    protected void exitContVideoItem(Form f) {
    }


    protected void exitDialogTest(Form f) {
    }


    protected void exitRegister(Form f) {
    }


    protected void exitSplash(Form f) {
    }


    protected void exitTabs1(Form f) {
    }


    protected void exitSearch2Result(Form f) {
    }


    protected void exitPlayVideoScreen(Form f) {
    }


    protected void exitHome(Form f) {
    }


    protected void exitSearch1(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("DialogCustom".equals(f.getName())) {
            beforeDialogCustom(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(f.getName())) {
            beforePlayerProfile(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            beforeLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(f.getName())) {
            beforeTabSearch(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(f.getName())) {
            beforeContVideoItem(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(f.getName())) {
            beforeDialogTest(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            beforeRegister(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            beforeSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(f.getName())) {
            beforeTabs1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(f.getName())) {
            beforeSearch2Result(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(f.getName())) {
            beforePlayVideoScreen(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            beforeHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(f.getName())) {
            beforeSearch1(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeDialogCustom(Form f) {
    }


    protected void beforePlayerProfile(Form f) {
    }


    protected void beforeLogin(Form f) {
    }


    protected void beforeTabSearch(Form f) {
    }


    protected void beforeContVideoItem(Form f) {
    }


    protected void beforeDialogTest(Form f) {
    }


    protected void beforeRegister(Form f) {
    }


    protected void beforeSplash(Form f) {
    }


    protected void beforeTabs1(Form f) {
    }


    protected void beforeSearch2Result(Form f) {
    }


    protected void beforePlayVideoScreen(Form f) {
    }


    protected void beforeHome(Form f) {
    }


    protected void beforeSearch1(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("DialogCustom".equals(c.getName())) {
            beforeContainerDialogCustom(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(c.getName())) {
            beforeContainerPlayerProfile(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(c.getName())) {
            beforeContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(c.getName())) {
            beforeContainerTabSearch(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(c.getName())) {
            beforeContainerContVideoItem(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(c.getName())) {
            beforeContainerDialogTest(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(c.getName())) {
            beforeContainerRegister(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(c.getName())) {
            beforeContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(c.getName())) {
            beforeContainerTabs1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(c.getName())) {
            beforeContainerSearch2Result(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(c.getName())) {
            beforeContainerPlayVideoScreen(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            beforeContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(c.getName())) {
            beforeContainerSearch1(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerDialogCustom(Container c) {
    }


    protected void beforeContainerPlayerProfile(Container c) {
    }


    protected void beforeContainerLogin(Container c) {
    }


    protected void beforeContainerTabSearch(Container c) {
    }


    protected void beforeContainerContVideoItem(Container c) {
    }


    protected void beforeContainerDialogTest(Container c) {
    }


    protected void beforeContainerRegister(Container c) {
    }


    protected void beforeContainerSplash(Container c) {
    }


    protected void beforeContainerTabs1(Container c) {
    }


    protected void beforeContainerSearch2Result(Container c) {
    }


    protected void beforeContainerPlayVideoScreen(Container c) {
    }


    protected void beforeContainerHome(Container c) {
    }


    protected void beforeContainerSearch1(Container c) {
    }

    protected void postShow(Form f) {
        if("DialogCustom".equals(f.getName())) {
            postDialogCustom(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(f.getName())) {
            postPlayerProfile(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            postLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(f.getName())) {
            postTabSearch(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(f.getName())) {
            postContVideoItem(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(f.getName())) {
            postDialogTest(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            postRegister(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            postSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(f.getName())) {
            postTabs1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(f.getName())) {
            postSearch2Result(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(f.getName())) {
            postPlayVideoScreen(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            postHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(f.getName())) {
            postSearch1(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postDialogCustom(Form f) {
    }


    protected void postPlayerProfile(Form f) {
    }


    protected void postLogin(Form f) {
    }


    protected void postTabSearch(Form f) {
    }


    protected void postContVideoItem(Form f) {
    }


    protected void postDialogTest(Form f) {
    }


    protected void postRegister(Form f) {
    }


    protected void postSplash(Form f) {
    }


    protected void postTabs1(Form f) {
    }


    protected void postSearch2Result(Form f) {
    }


    protected void postPlayVideoScreen(Form f) {
    }


    protected void postHome(Form f) {
    }


    protected void postSearch1(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("DialogCustom".equals(c.getName())) {
            postContainerDialogCustom(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(c.getName())) {
            postContainerPlayerProfile(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(c.getName())) {
            postContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(c.getName())) {
            postContainerTabSearch(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(c.getName())) {
            postContainerContVideoItem(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(c.getName())) {
            postContainerDialogTest(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(c.getName())) {
            postContainerRegister(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(c.getName())) {
            postContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(c.getName())) {
            postContainerTabs1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(c.getName())) {
            postContainerSearch2Result(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(c.getName())) {
            postContainerPlayVideoScreen(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            postContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(c.getName())) {
            postContainerSearch1(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerDialogCustom(Container c) {
    }


    protected void postContainerPlayerProfile(Container c) {
    }


    protected void postContainerLogin(Container c) {
    }


    protected void postContainerTabSearch(Container c) {
    }


    protected void postContainerContVideoItem(Container c) {
    }


    protected void postContainerDialogTest(Container c) {
    }


    protected void postContainerRegister(Container c) {
    }


    protected void postContainerSplash(Container c) {
    }


    protected void postContainerTabs1(Container c) {
    }


    protected void postContainerSearch2Result(Container c) {
    }


    protected void postContainerPlayVideoScreen(Container c) {
    }


    protected void postContainerHome(Container c) {
    }


    protected void postContainerSearch1(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("DialogCustom".equals(rootName)) {
            onCreateDialogCustom();
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(rootName)) {
            onCreatePlayerProfile();
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(rootName)) {
            onCreateLogin();
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(rootName)) {
            onCreateTabSearch();
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(rootName)) {
            onCreateContVideoItem();
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(rootName)) {
            onCreateDialogTest();
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(rootName)) {
            onCreateRegister();
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(rootName)) {
            onCreateSplash();
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(rootName)) {
            onCreateTabs1();
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(rootName)) {
            onCreateSearch2Result();
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(rootName)) {
            onCreatePlayVideoScreen();
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(rootName)) {
            onCreateHome();
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(rootName)) {
            onCreateSearch1();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateDialogCustom() {
    }


    protected void onCreatePlayerProfile() {
    }


    protected void onCreateLogin() {
    }


    protected void onCreateTabSearch() {
    }


    protected void onCreateContVideoItem() {
    }


    protected void onCreateDialogTest() {
    }


    protected void onCreateRegister() {
    }


    protected void onCreateSplash() {
    }


    protected void onCreateTabs1() {
    }


    protected void onCreateSearch2Result() {
    }


    protected void onCreatePlayVideoScreen() {
    }


    protected void onCreateHome() {
    }


    protected void onCreateSearch1() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("DialogCustom".equals(f.getName())) {
            getStateDialogCustom(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("PlayerProfile".equals(f.getName())) {
            getStatePlayerProfile(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Login".equals(f.getName())) {
            getStateLogin(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("TabSearch".equals(f.getName())) {
            getStateTabSearch(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ContVideoItem".equals(f.getName())) {
            getStateContVideoItem(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("DialogTest".equals(f.getName())) {
            getStateDialogTest(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Register".equals(f.getName())) {
            getStateRegister(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Splash".equals(f.getName())) {
            getStateSplash(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Tabs1".equals(f.getName())) {
            getStateTabs1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Search2Result".equals(f.getName())) {
            getStateSearch2Result(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("PlayVideoScreen".equals(f.getName())) {
            getStatePlayVideoScreen(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Home".equals(f.getName())) {
            getStateHome(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Search1".equals(f.getName())) {
            getStateSearch1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateDialogCustom(Form f, Hashtable h) {
    }


    protected void getStatePlayerProfile(Form f, Hashtable h) {
    }


    protected void getStateLogin(Form f, Hashtable h) {
    }


    protected void getStateTabSearch(Form f, Hashtable h) {
    }


    protected void getStateContVideoItem(Form f, Hashtable h) {
    }


    protected void getStateDialogTest(Form f, Hashtable h) {
    }


    protected void getStateRegister(Form f, Hashtable h) {
    }


    protected void getStateSplash(Form f, Hashtable h) {
    }


    protected void getStateTabs1(Form f, Hashtable h) {
    }


    protected void getStateSearch2Result(Form f, Hashtable h) {
    }


    protected void getStatePlayVideoScreen(Form f, Hashtable h) {
    }


    protected void getStateHome(Form f, Hashtable h) {
    }


    protected void getStateSearch1(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("DialogCustom".equals(f.getName())) {
            setStateDialogCustom(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayerProfile".equals(f.getName())) {
            setStatePlayerProfile(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Login".equals(f.getName())) {
            setStateLogin(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("TabSearch".equals(f.getName())) {
            setStateTabSearch(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ContVideoItem".equals(f.getName())) {
            setStateContVideoItem(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("DialogTest".equals(f.getName())) {
            setStateDialogTest(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            setStateRegister(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            setStateSplash(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Tabs1".equals(f.getName())) {
            setStateTabs1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search2Result".equals(f.getName())) {
            setStateSearch2Result(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("PlayVideoScreen".equals(f.getName())) {
            setStatePlayVideoScreen(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            setStateHome(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Search1".equals(f.getName())) {
            setStateSearch1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateDialogCustom(Form f, Hashtable state) {
    }


    protected void setStatePlayerProfile(Form f, Hashtable state) {
    }


    protected void setStateLogin(Form f, Hashtable state) {
    }


    protected void setStateTabSearch(Form f, Hashtable state) {
    }


    protected void setStateContVideoItem(Form f, Hashtable state) {
    }


    protected void setStateDialogTest(Form f, Hashtable state) {
    }


    protected void setStateRegister(Form f, Hashtable state) {
    }


    protected void setStateSplash(Form f, Hashtable state) {
    }


    protected void setStateTabs1(Form f, Hashtable state) {
    }


    protected void setStateSearch2Result(Form f, Hashtable state) {
    }


    protected void setStatePlayVideoScreen(Form f, Hashtable state) {
    }


    protected void setStateHome(Form f, Hashtable state) {
    }


    protected void setStateSearch1(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("cmbTeam".equals(listName)) {
            return initListModelCmbTeam(cmp);
        }
        if("ComboBox".equals(listName)) {
            return initListModelComboBox(cmp);
        }
        if("cmbCountry".equals(listName)) {
            return initListModelCmbCountry(cmp);
        }
        if("ComboBox2".equals(listName)) {
            return initListModelComboBox2(cmp);
        }
        if("ComboBox1".equals(listName)) {
            return initListModelComboBox1(cmp);
        }
        if("ComboBox3".equals(listName)) {
            return initListModelComboBox3(cmp);
        }
        if("cmbLeague".equals(listName)) {
            return initListModelCmbLeague(cmp);
        }
        if("cmbPlayers".equals(listName)) {
            return initListModelCmbPlayers(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelCmbTeam(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox(List cmp) {
        return false;
    }

    protected boolean initListModelCmbCountry(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox2(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox1(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox3(List cmp) {
        return false;
    }

    protected boolean initListModelCmbLeague(List cmp) {
        return false;
    }

    protected boolean initListModelCmbPlayers(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("DialogCustom")) {
            if("btnNo".equals(c.getName())) {
                onDialogCustom_BtnNoAction(c, event);
                return;
            }
            if("btnYes".equals(c.getName())) {
                onDialogCustom_BtnYesAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("PlayerProfile")) {
            if("Button".equals(c.getName())) {
                onPlayerProfile_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onPlayerProfile_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onPlayerProfile_Button2Action(c, event);
                return;
            }
            if("ShareButton2".equals(c.getName())) {
                onPlayerProfile_ShareButton2Action(c, event);
                return;
            }
            if("Video".equals(c.getName())) {
                onPlayerProfile_VideoAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Login")) {
            if("TextField".equals(c.getName())) {
                onLogin_TextFieldAction(c, event);
                return;
            }
            if("TextField1".equals(c.getName())) {
                onLogin_TextField1Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onLogin_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onLogin_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onLogin_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("TabSearch")) {
            if("ButtonTop".equals(c.getName())) {
                onTabSearch_ButtonTopAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ContVideoItem")) {
            if("btnPlayerVid".equals(c.getName())) {
                onContVideoItem_BtnPlayerVidAction(c, event);
                return;
            }
            if("shareButtonSocial".equals(c.getName())) {
                onContVideoItem_ShareButtonSocialAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onContVideoItem_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onContVideoItem_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onContVideoItem_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Register")) {
            if("TextField".equals(c.getName())) {
                onRegister_TextFieldAction(c, event);
                return;
            }
            if("TextField2".equals(c.getName())) {
                onRegister_TextField2Action(c, event);
                return;
            }
            if("TextField1".equals(c.getName())) {
                onRegister_TextField1Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onRegister_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Home")) {
            if("ButtonTop".equals(c.getName())) {
                onHome_ButtonTopAction(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onHome_Button5Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onHome_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onHome_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onHome_Button2Action(c, event);
                return;
            }
            if("line1Share".equals(c.getName())) {
                onHome_Line1ShareAction(c, event);
                return;
            }
            if("btnLine1".equals(c.getName())) {
                onHome_BtnLine1Action(c, event);
                return;
            }
            if("Button6".equals(c.getName())) {
                onHome_Button6Action(c, event);
                return;
            }
            if("line2Share".equals(c.getName())) {
                onHome_Line2ShareAction(c, event);
                return;
            }
            if("btnLine2".equals(c.getName())) {
                onHome_BtnLine2Action(c, event);
                return;
            }
            if("Button7".equals(c.getName())) {
                onHome_Button7Action(c, event);
                return;
            }
            if("line3Share".equals(c.getName())) {
                onHome_Line3ShareAction(c, event);
                return;
            }
            if("btnLine3".equals(c.getName())) {
                onHome_BtnLine3Action(c, event);
                return;
            }
            if("cmbCountry".equals(c.getName())) {
                onHome_CmbCountryAction(c, event);
                return;
            }
            if("cmbLeague".equals(c.getName())) {
                onHome_CmbLeagueAction(c, event);
                return;
            }
            if("cmbTeam".equals(c.getName())) {
                onHome_CmbTeamAction(c, event);
                return;
            }
            if("cmbPlayers".equals(c.getName())) {
                onHome_CmbPlayersAction(c, event);
                return;
            }
            if("brtnSearchButton1".equals(c.getName())) {
                onHome_BrtnSearchButton1Action(c, event);
                return;
            }
            if("txtVidSearch1".equals(c.getName())) {
                onHome_TxtVidSearch1Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onHome_Button3Action(c, event);
                return;
            }
            if("txtVidSearch".equals(c.getName())) {
                onHome_TxtVidSearchAction(c, event);
                return;
            }
            if("btnSearchVid".equals(c.getName())) {
                onHome_BtnSearchVidAction(c, event);
                return;
            }
            if("Video".equals(c.getName())) {
                onHome_VideoAction(c, event);
                return;
            }
            if("ShareButton3".equals(c.getName())) {
                onHome_ShareButton3Action(c, event);
                return;
            }
            if("txtFullName".equals(c.getName())) {
                onHome_TxtFullNameAction(c, event);
                return;
            }
            if("txtPhoneNumber".equals(c.getName())) {
                onHome_TxtPhoneNumberAction(c, event);
                return;
            }
            if("txtEmail".equals(c.getName())) {
                onHome_TxtEmailAction(c, event);
                return;
            }
            if("txtComment".equals(c.getName())) {
                onHome_TxtCommentAction(c, event);
                return;
            }
            if("btnSubmit".equals(c.getName())) {
                onHome_BtnSubmitAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Search1")) {
            if("TextField".equals(c.getName())) {
                onSearch1_TextFieldAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onSearch1_ButtonAction(c, event);
                return;
            }
            if("ComboBox".equals(c.getName())) {
                onSearch1_ComboBoxAction(c, event);
                return;
            }
            if("ComboBox1".equals(c.getName())) {
                onSearch1_ComboBox1Action(c, event);
                return;
            }
            if("ComboBox2".equals(c.getName())) {
                onSearch1_ComboBox2Action(c, event);
                return;
            }
            if("ComboBox3".equals(c.getName())) {
                onSearch1_ComboBox3Action(c, event);
                return;
            }
        }
    }

      protected void onDialogCustom_BtnNoAction(Component c, ActionEvent event) {
      }

      protected void onDialogCustom_BtnYesAction(Component c, ActionEvent event) {
      }

      protected void onPlayerProfile_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onPlayerProfile_Button1Action(Component c, ActionEvent event) {
      }

      protected void onPlayerProfile_Button2Action(Component c, ActionEvent event) {
      }

      protected void onPlayerProfile_ShareButton2Action(Component c, ActionEvent event) {
      }

      protected void onPlayerProfile_VideoAction(Component c, ActionEvent event) {
      }

      protected void onLogin_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onLogin_TextField1Action(Component c, ActionEvent event) {
      }

      protected void onLogin_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onLogin_Button1Action(Component c, ActionEvent event) {
      }

      protected void onLogin_Button2Action(Component c, ActionEvent event) {
      }

      protected void onTabSearch_ButtonTopAction(Component c, ActionEvent event) {
      }

      protected void onContVideoItem_BtnPlayerVidAction(Component c, ActionEvent event) {
      }

      protected void onContVideoItem_ShareButtonSocialAction(Component c, ActionEvent event) {
      }

      protected void onContVideoItem_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onContVideoItem_Button1Action(Component c, ActionEvent event) {
      }

      protected void onContVideoItem_Button2Action(Component c, ActionEvent event) {
      }

      protected void onRegister_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onRegister_TextField2Action(Component c, ActionEvent event) {
      }

      protected void onRegister_TextField1Action(Component c, ActionEvent event) {
      }

      protected void onRegister_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onHome_ButtonTopAction(Component c, ActionEvent event) {
      }

      protected void onHome_Button5Action(Component c, ActionEvent event) {
      }

      protected void onHome_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onHome_Button1Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button2Action(Component c, ActionEvent event) {
      }

      protected void onHome_Line1ShareAction(Component c, ActionEvent event) {
      }

      protected void onHome_BtnLine1Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button6Action(Component c, ActionEvent event) {
      }

      protected void onHome_Line2ShareAction(Component c, ActionEvent event) {
      }

      protected void onHome_BtnLine2Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button7Action(Component c, ActionEvent event) {
      }

      protected void onHome_Line3ShareAction(Component c, ActionEvent event) {
      }

      protected void onHome_BtnLine3Action(Component c, ActionEvent event) {
      }

      protected void onHome_CmbCountryAction(Component c, ActionEvent event) {
      }

      protected void onHome_CmbLeagueAction(Component c, ActionEvent event) {
      }

      protected void onHome_CmbTeamAction(Component c, ActionEvent event) {
      }

      protected void onHome_CmbPlayersAction(Component c, ActionEvent event) {
      }

      protected void onHome_BrtnSearchButton1Action(Component c, ActionEvent event) {
      }

      protected void onHome_TxtVidSearch1Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button3Action(Component c, ActionEvent event) {
      }

      protected void onHome_TxtVidSearchAction(Component c, ActionEvent event) {
      }

      protected void onHome_BtnSearchVidAction(Component c, ActionEvent event) {
      }

      protected void onHome_VideoAction(Component c, ActionEvent event) {
      }

      protected void onHome_ShareButton3Action(Component c, ActionEvent event) {
      }

      protected void onHome_TxtFullNameAction(Component c, ActionEvent event) {
      }

      protected void onHome_TxtPhoneNumberAction(Component c, ActionEvent event) {
      }

      protected void onHome_TxtEmailAction(Component c, ActionEvent event) {
      }

      protected void onHome_TxtCommentAction(Component c, ActionEvent event) {
      }

      protected void onHome_BtnSubmitAction(Component c, ActionEvent event) {
      }

      protected void onSearch1_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSearch1_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onSearch1_ComboBoxAction(Component c, ActionEvent event) {
      }

      protected void onSearch1_ComboBox1Action(Component c, ActionEvent event) {
      }

      protected void onSearch1_ComboBox2Action(Component c, ActionEvent event) {
      }

      protected void onSearch1_ComboBox3Action(Component c, ActionEvent event) {
      }

}
