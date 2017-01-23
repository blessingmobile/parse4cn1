/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.capture.Capture;
import com.codename1.components.InfiniteProgress;
import com.codename1.components.MediaPlayer;
import com.codename1.components.OnOffSwitch;
import com.codename1.components.ShareButton;
import com.codename1.components.SpanLabel;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.Log;
import com.codename1.io.MultipartRequest;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.media.Media;
import com.codename1.media.MediaManager;
import com.codename1.messaging.Message;
import com.codename1.processing.Result;
import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.ListModel;
import com.codename1.ui.util.Resources;
import com.parse4cn1.Parse;
import com.parse4cn1.ParseException;
import com.parse4cn1.ParseObject;
import com.parse4cn1.ParseUser;
import com.pmovil.nativega.GANative;
import com.pmovil.nativega.HitBuilders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import services.AdvertService;
import services.Advert;
import services.AfroUtility;
import services.UserService;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    //com.pmovil.nativega.Tracker tracker = ga.newTracker("UA-89102159-1");//MOBILE WEB

    private Advert advertObject;
    private java.util.List adverts;

    private com.pmovil.nativega.Tracker tracker;
    private Button btnLine2;
    private String vidName;
    private String name2;
    private boolean debugFlag = true;
    private int selectedProfileIndex = 1;
    private Form thisForm;
    private String selectedPlayer = "";
    private static Tabs tabs = null;
    private static Container tabVideo = null;
    private Resources res;
    private java.util.List players;
    private static ParseObject selectedPlayerHashtable;
    private String picture = "";
    private String clickUrl;
    private Hashtable selectedAdvertHash;
    private Hashtable selectedPlayerHash;
    String tempUri;

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {

        String url = "http://mfactory.dedicated.co.za:1337/parse";
        Parse.initialize(url, "app", null);
        //Log.setLevel(Log.REPORTING_NONE);
        Log.setLevel(Log.DEBUG);

        ParseUser user = UserService.userLogin("blessing@mfactory.mobi", "12345");

        Display.getInstance().addEdtErrorHandler(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                evt.consume();
                Log.p("Exception in AppName version " + Display.getInstance().getProperty("AppVersion", "Unknown"), Log.DEBUG);
                Log.p("OS " + Display.getInstance().getPlatformName(), Log.DEBUG);
                Log.p("Error " + evt.getSource(), Log.DEBUG);
                Log.p("Current Form " + Display.getInstance().getCurrent().getName(), Log.DEBUG);
                Log.e((Throwable) evt.getSource());
                //Log.sendLog();
            }
        });

        NetworkManager.getInstance().addErrorListener(new ActionListener<NetworkEvent>() {

            @Override
            public void actionPerformed(NetworkEvent evt) {
                Log.p("Network Error: " + evt.getMessage(), Log.DEBUG);
            }
        });

        this.res = res;

        adverts = AdvertService.getEnabledAd();
        advertObject = (Advert) adverts.get(0);

        players = PlayerModel.getPlayers();

    }

    @Override
    protected void beforeHome(Form f) {

        thisForm = f;

        try {
            tabs = (Tabs) findByName("Tabs", f);

            //if (debugFlag == true) {
            tabs.hideTabs();
            //tabs.setSelectedIndex(2);
            //}

            Container banner = (Container) findByName("Banner", f);
            generateAd(banner);

            /*Container ContainerSearch = (Container)findByName("ContainerSearch", tabs);
             tabs.removeComponent(ContainerSearch);*/
            final Container Result1 = (Container) findByName("Result1", tabs);
            final Container Result2 = (Container) findByName("Result2", tabs);
            final Container Result3 = (Container) findByName("Result3", tabs);

            ParseObject hash1 = (ParseObject) players.get(selectedProfileIndex);
            ParseObject hash2 = (ParseObject) players.get(4);
            ParseObject hash3 = (ParseObject) players.get(7);

            //BUTTON 1
            Button btnLine1 = (Button) findByName("btnLine1", tabs);
            Label line1Img = (Label) findByName("line1Img", tabs);
            Label line1Title = (Label) findByName("line1Title", tabs);
            ShareButton line1Share = (ShareButton) findByName("line1Share", tabs);
            String name = hash1.get("name").toString();
            String imgName = hash1.get("imgName").toString();
            line1Title.setText(name);
            InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholderSquare.png");//TEMP
            EncodedImage placeHolder = EncodedImage.create(is);
            Image image = URLImage.createToStorage(placeHolder, name, imgName, URLImage.RESIZE_SCALE_TO_FILL);
            //image = image.scaled(188, -1);
            line1Img.setIcon(image);
            line1Share.setTextToShare(name + " Check out Top Player Profile on the Afro Soccer 99 App.");

            //BUTTON 2
            btnLine2 = (Button) findByName("btnLine2", tabs);
            Label line2Img = (Label) findByName("line2Img", tabs);
            Label line2Title = (Label) findByName("line2Title", tabs);
            ShareButton line2Share = (ShareButton) findByName("line2Share", tabs);
            name2 = hash2.get("name").toString();
            String imgName2 = hash2.get("imgName").toString();
            line2Title.setText(name2);
            InputStream is2 = Display.getInstance().getResourceAsStream(getClass(), "/placeholderSquare.png");//TEMP
            EncodedImage placeHolder2 = EncodedImage.create(is2);
            Image image2 = URLImage.createToStorage(placeHolder2, name2, imgName2, URLImage.RESIZE_SCALE_TO_FILL);
            //image2 = image2.scaled(188, -1);
            line2Img.setIcon(image2);
            line2Share.setTextToShare(name2 + " Check out Top Player Video on the Afro Soccer 99 App.");
            vidName = hash2.get("vidName").toString();

            btnLine2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                    //playVideoUrl(vidName, "video/mp4", name2 + " Top Video", btnLine2);
                }
            });

            //BUTTON 3
            final Button btnLine3 = (Button) findByName("btnLine3", tabs);
            Label line3Img = (Label) findByName("line3Img", tabs);
            Label line3Title = (Label) findByName("line3Title", tabs);
            ShareButton line3Share = (ShareButton) findByName("line3Share", tabs);
            String name3 = hash3.get("name").toString();
            String imgName3 = hash3.get("imgName").toString();
            line3Title.setText(name3);
            InputStream is3 = Display.getInstance().getResourceAsStream(getClass(), "/placeholderSquare.png");//TEMP
            EncodedImage placeHolder3 = EncodedImage.create(is3);
            Image image3 = URLImage.createToStorage(placeHolder3, name3, imgName3, URLImage.RESIZE_SCALE_TO_FILL);
            //image3 = image3.scaled(188, -1);
            line3Img.setIcon(image3);
            line3Share.setTextToShare(name3 + " Check out Top Player Profile on the Afro Soccer 99 App.");

            final String reactionName = hash3.get("reactionName").toString();

            btnLine3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                    btnLine2 = btnLine3;
                    vidName = reactionName;
                    name2 = name3;
                    //playVideoUrl(reactionName, "video/mp4", name3 + " Top Reaction", btnLine3);
                }
            });

            f.revalidate();

            //tabs.setSelectedIndex(2);
            TextField txtVidSearch = (TextField) findByName("txtVidSearch", tabs);
            txtVidSearch.setText("");

            AfroUtility.setupTabs(tabs);

            Button Button5 = (Button) findByName("Button5", f);
            Button5.setText("");

            //f.removeAllCommands();
            Command exit = new Command("") {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
                    //boolean flag = Dialog.show("Exit?", "Exit Afro Soccer App?", "Yes", "No");

                    if (tabs.getSelectedIndex() != 0) {
                        tabs.setSelectedIndex(0);
                    } else {
                        showDialog("", "Exit Afro Soccer App?", new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                Display.getInstance().exitApplication();
                            }
                        });
                    }

                }

            };
            f.setBackCommand(exit);
            f.addCommand(exit);

            GANative ga = GANative.getInstance();
            ga.setLocalDispatchPeriod(30);
            tracker = ga.newTracker("UA-89093789-1");//MOBILE APP
            tracker.setAppName("Afro Soccer");
            tracker.setAppVersion("1.0");

            //home, search, video, about, feedback
            tabs.addSelectionListener(new SelectionListener() {

                @Override
                public void selectionChanged(int oldSelected, int newSelected) {

                    switch (newSelected) {
                        case 0:
                            f.setTitle("HOME");
                            tracker.setScreenName("HOME");
                            tracker.send(new HitBuilders.ScreenViewBuilder().build());
                            break;
                        case 1:
                            f.setTitle("SEARCH");
                            tracker.setScreenName("SEARCH");
                            tracker.send(new HitBuilders.ScreenViewBuilder().build());
                            break;
                        case 2:
                            f.setTitle("VIDEO");
                            tracker.setScreenName("VIDEO");
                            tracker.send(new HitBuilders.ScreenViewBuilder().build());
                            break;
                        case 3:
                            f.setTitle("ABOUT");
                            tracker.setScreenName("ABOUT");
                            tracker.send(new HitBuilders.ScreenViewBuilder().build());
                            break;
                        case 4:
                            f.setTitle("FEEDBACK");
                            tracker.setScreenName("FEEDBACK");
                            tracker.send(new HitBuilders.ScreenViewBuilder().build());
                            break;
                    }

                }
            });

            final ComboBox cmbCountry = (ComboBox) findByName("cmbCountry", f);
            final ComboBox cmbLeague = (ComboBox) findByName("cmbLeague", f);
            final ComboBox cmbTeam = (ComboBox) findByName("cmbTeam", f);
            final ComboBox cmbPlayers = (ComboBox) findByName("cmbPlayers", f);

            cmbPlayers.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    selectedPlayer = cmbPlayers.getSelectedItem().toString();

                }
            });

            cmbCountry.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    int selectedIndex = cmbCountry.getSelectedIndex() - 1;
                    ParseObject tempItem = (ParseObject) players.get(selectedIndex);
                    selectedPlayerHashtable = tempItem;
                    String league = tempItem.get("league").toString();
                    String leagues[] = {"Select League", league};
                    DefaultListModel d = new DefaultListModel(leagues);
                    cmbLeague.setModel(d);
                }
            });

            cmbLeague.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    ParseObject tempItem = selectedPlayerHashtable;
                    String team = tempItem.get("team").toString();
                    String teams[] = {"Select Team", team};
                    DefaultListModel d = new DefaultListModel(teams);
                    cmbTeam.setModel(d);
                }
            });

            cmbTeam.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    ParseObject tempItem = selectedPlayerHashtable;
                    String name = tempItem.get("name").toString();
                    String playerName[] = {"Select Player", name};
                    DefaultListModel d = new DefaultListModel(playerName);
                    cmbPlayers.setModel(d);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        playVideo("");

    }

    private void generateAd(Container banner) {
        Form parent = banner.getComponentForm();
        Button buttonTop = (Button) findByName("ButtonTop", parent);

        if (advertObject != null) {

            clickUrl = advertObject.getClickUrl();
            String imageUrl = advertObject.getImageUrl();

            String name1 = "advert_" + advertObject.getFile().getUrl();
            String imageName = imageUrl;

            try {

                InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholder.png");//TEMP
                EncodedImage placeHolder = EncodedImage.create(is);

                Image image = URLImage.createToStorage(placeHolder, name1, imageName, URLImage.RESIZE_SCALE);

                //lblPlayerName.setText(name);
                banner.getStyle().setBgImage(image);
                //banner.getStyle().setBackgroundType(banner.getStyle().BACKGROUND_IMAGE_SCALED_FILL);
                banner.revalidate();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            if (buttonTop != null) {
                buttonTop.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        Display.getInstance().execute(clickUrl);

                    }
                });
            }

        } else {
            Log.p("Statemachine -> generateAd(..) ads object null", Log.DEBUG);
        }
    }

    private void playVideo(String search) {
        //Videos tab: Show default Videos
        tabVideo = (Container) findByName("TabVideo", tabs);

        Label lblVideoNum = (Label) findByName("lblVideoNum", tabs);
        Label lblVideoSearchQuery = (Label) findByName("lblVideoSearchQuery", tabs);

        tabVideo.removeAll();

        //Localhost: cached data??
        java.util.List videos = PlayerModel.getPlayer(search);

        lblVideoNum.setText("Number of videos found");
        lblVideoSearchQuery.setText("\'" + videos.size() + "\'");

        for (int i = 0; i < videos.size(); i++) {
            ParseObject hashtable = (ParseObject) videos.get(i);
            Container contVideoItem = (Container) createContainer("/theme", "ContVideoItem");
            Label lblPlayerName = (Label) findByName("lblPlayerName", contVideoItem);

            Container contPlayerVideo = (Container) findByName("contPlayerVideo", contVideoItem);

            final Button btnPlayerVideo = (Button) findByName("btnPlayerVid", contVideoItem);

            btnPlayerVideo.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    String name = hashtable.get("name").toString();
                    String vidName = hashtable.get("vidName").toString();
                    playVideoUrl(null, vidName, "video/mp4", name, btnPlayerVideo);

                }
            });

            ShareButton shareButtonSocial = (ShareButton) findByName("shareButtonSocial", contVideoItem);
            shareButtonSocial.setTextToShare("Check out the best Soccer 99 app as soon as possible.");

            String name = hashtable.get("name").toString();
            String imageName = hashtable.get("imgName").toString();

            try {
                InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholder.png");//TEMP
                EncodedImage placeHolder = EncodedImage.create(is);

                Image image = URLImage.createToStorage(placeHolder, name, imageName, URLImage.RESIZE_SCALE);

                lblPlayerName.setText(name);
                contPlayerVideo.getStyle().setBgImage(image);
                contPlayerVideo.getStyle().setBackgroundType(contPlayerVideo.getStyle().BACKGROUND_IMAGE_SCALED_FILL);
                contPlayerVideo.revalidate();

            } catch (IOException ex) {

            }

            tabVideo.add(contVideoItem);
        }//end for 
    }

    @Override
    protected void beforeRegister(Form f) {
        f.removeAllCommands();
    }

    /*@Override
     protected void onHome_BtnAdAction(Component c, ActionEvent event) {

     boolean answer = Dialog.show("Advert", "Would you like to view the Advert?", "Yes", "No");

     if (true == answer) {
     Display.getInstance().execute("http://pharoahgroup.com/");
     } else {
     //do nothing
     }

     }*/
    public void playVideoUrl(Form f, String video, String mime, String title, Component c) {
        final Form current = c.getComponentForm();
        Form d;

        if (f != null) {
            d = f;
        } else {
            d = new Form();
            Command back = new Command("Back") {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    current.showBack();

                }

            };
            d.setBackCommand(back);
        }
        Container north = new Container(new FlowLayout(d.CENTER));
        north.add(new Label());
        d.setTitle("Loading video ...");
        InfiniteProgress p = new InfiniteProgress();
        north.addComponent(p);
        d.revalidate();

        d.setLayout(new BorderLayout());
        final MediaPlayer mp = new MediaPlayer();
        final Timer t = new Timer();
        final TimerTask ta = new TimerTask() {

            public void run() {
                //System.out.println("isPlaying: " + mp.getMedia() + " playing:  " + repeat);
                if (mp.getMedia() != null && mp.getMedia().isPlaying()) {
                    d.setTitle(title);
                    t.cancel();
                    north.removeComponent(p);
                    d.revalidate();
                }
            }
        };

        t.schedule(ta, 50, 20);

        mp.setDataSource(video);
        mp.setAutoplay(true);

        d.addComponent(BorderLayout.NORTH, north);
        d.addComponent(BorderLayout.CENTER, mp);

        d.show();
    }

    @Override
    protected void onHome_VideoAction(Component c, ActionEvent event) {
        //playVideo("/good.mp4", "video/mp4", "Video 1", c);

    }

    @Override
    protected void onHome_BtnSubmitAction(Component c, ActionEvent event) {

        TextField txtFullName = findTxtFullName();
        TextField txtPhoneNumber = findTxtPhoneNumber();
        TextField txtEmail = findTxtEmail();
        TextArea txtComment = findTxtComment();

        Message m = new Message("<html><body>"
                + "<p>Full name: " + txtFullName.getText()
                + "</p><p>Phone number: " + txtPhoneNumber.getText()
                + "</p><p>Email: " + txtEmail.getText()
                + "</p><p>Comment: " + txtComment.getText()
                + "</p></body></html>");
        m.setMimeType(Message.MIME_HTML);

        // notice that we provide a plain text alternative as well in the send method. 
        String[] emails = new String[]{"samson.neil7@gmail.com", "bless005@gmail.com"};
        boolean success = m.sendMessageViaCloudSync("Afro Soccer", "samson.neil7@gmail.com", "Neil Samson", "Afro Soccer Feedback", "");
        success = m.sendMessageViaCloudSync("Afro Soccer", "bless005@gmail.com", "Neil Samson", "Afro Soccer Feedback", "");
        if (success) {
            //Dialog.show("Success", "Feedback received, thank you!", "Close", null);
            showDialog("Success", "Feedback received, thank you!", "Ok", new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    Display.getInstance().exitApplication();
                }
            });
        }
//System.out.println("success=" + success);

    }

//    @Override
//    protected void onHome_Button4Action(Component c, ActionEvent event) {
//
//        playVideo("/euro2016.mp4", "video/mp4", "Video 2", c);
//    }
    @Override
    protected void beforePlayerProfile(Form f) {
        Container banner = (Container) findByName("Banner", f);
        generateAd(banner);
        try {

            //selectedModel = PlayerModel.getPlayer(selectedPlayer);
            findLblCountry().setText(selectedPlayerHashtable.get("country").toString());
            findLblLeague().setText(selectedPlayerHashtable.get("league").toString());
            findLblTeam().setText(selectedPlayerHashtable.get("team").toString());
            findLblGames().setText(selectedPlayerHashtable.get("nationalCaps").toString());
            findLblGoals().setText(selectedPlayerHashtable.get("motm").toString());
            findLblYellowCards().setText(selectedPlayerHashtable.get("redCard").toString());
            findLblAssists().setText(selectedPlayerHashtable.get("star").toString());
            findLblDescription().setText(selectedPlayerHashtable.get("playerDescription").toString());
            findLblPlayerTitle().setText("\'" + selectedPlayerHashtable.get("name").toString() + "\'");

            String name = selectedPlayerHashtable.get("name").toString();
            String imgName = selectedPlayerHashtable.get("imgName").toString();
            String vidName = selectedPlayerHashtable.get("vidName").toString();

            InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholderSquare.png");//TEMP
            EncodedImage placeHolder = EncodedImage.create(is);
            Image img = URLImage.createToStorage(placeHolder, name, imgName, URLImage.RESIZE_SCALE_TO_FILL);
            findLblIcon().setIcon(img);

            Container ContPlayerProfile = (Container) findByName("ContProfilePlayerPic", f);
            final Button Video = (Button) findByName("Video", f);

            ContPlayerProfile.getStyle().setBgImage(img);
            ContPlayerProfile.getStyle().setBackgroundType(ContPlayerProfile.getStyle().BACKGROUND_IMAGE_SCALED_FILL);
            ContPlayerProfile.revalidate();

            findLblIcon().repaint();

            Video.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                    playVideoUrl(null, vidName, "video/mp4", name + " Top Video", Video);

                }
            });

        } catch (IOException ex) {
        }

    }

    @Override
    protected void onPlayerProfile_VideoAction(Component c, ActionEvent event) {
        //playVideo("/top20.mp4", "video/mp4", "Video 3", c);

    }

    /*@Override
     protected boolean onHomeButton5() {
     selectedPlayer = "Ahmed Musa";
     //selectedModel = PlayerModel.getPlayer(selectedPlayer);
     return false;
     }*/
    @Override
    protected void onHome_Button6Action(Component c, ActionEvent event) {
        // playVideo("/euro2016.mp4", "video/mp4", "Basem Morsi", c);

    }

    @Override
    protected void onHome_Button7Action(Component c, ActionEvent event) {
        //playVideo("/good.mp4", "video/mp4", "Oupa Manyisa", c);

    }

    /* @Override
     protected boolean onHomeFind() {

     boolean flag = false;

     if (findCmbCountry().getSelectedIndex() == 0) {
     flag = true;
     Dialog.show("Error", "Please select a country before pressing Search", "Close", null);
     } else if (findCmbLeague().getSelectedIndex() == 0) {
     flag = true;
     Dialog.show("Error", "Please select a league before pressing Search", "Close", null);
     } else if (findCmbTeam().getSelectedIndex() == 0) {
     flag = true;
     Dialog.show("Error", "Please select a team before pressing Search", "Close", null);
     } else if (findCmbPlayers().getSelectedIndex() == 0) {
     flag = true;
     Dialog.show("Error", "Please select a player before pressing Search", "Close", null);
     }

     return flag;

     }*/
    @Override
    protected void onHome_BtnSearchVidAction(Component c, ActionEvent event) {

        Form f = c.getComponentForm();

        Label lblVideoNum = (Label) findByName("lblVideoNum", f);
        Label lblVideoSearchQuery = (Label) findByName("lblVideoSearchQuery", f);

        tabVideo = (Container) findByName("TabVideo", tabs);
        tabVideo.removeAll();
        TextField txtVidSearch = findTxtVidSearch();
        String strVidSearch = txtVidSearch.getText();

        playVideo(strVidSearch);

        tabs.revalidate();

        /*strVidSearch = strVidSearch.toLowerCase();
         ArrayList hashPlayers = PlayerModel.getPlayer(strVidSearch);

         Container contVideoText = (Container) findByName("contVideoText", tabs);
         lblVideoNum.setText("Number of videos found");
         lblVideoSearchQuery.setText("\'" + hashPlayers.size() + "\'");

         contVideoText.revalidate();

         if (strVidSearch.length() > 0 && hashPlayers != null && hashPlayers.size() > 0) {
         //Localhost: cached data??
         for (int i = 0; i < hashPlayers.size(); i++) {

         Hashtable tempHashPlayers = (Hashtable) hashPlayers.get(i);

         Container contVideoItem = (Container) createContainer("/theme", "ContVideoItem");

         Label lblPlayerName = (Label) findByName("lblPlayerName", contVideoItem);
         Button btnPlayerVideo = (Button) findByName("btnPlayerVideo", contVideoItem);
         ShareButton shareButtonSocial = (ShareButton) findByName("shareButtonSocial", contVideoItem);
         shareButtonSocial.setTextToShare("Check out the best Soccer 99 app as soon as possible.");
         tabVideo.add(contVideoItem);

         Container contPlayerVideo = (Container) findByName("contPlayerVideo", contVideoItem);
         InputStream is = Display.getInstance().getResourceAsStream(getClass(), tempHashPlayers.get("imgName").toString());

         try {

         Image img = Image.createImage(is);
         contPlayerVideo.getStyle().setBgImage(img);
         contPlayerVideo.getStyle().setBackgroundType(contPlayerVideo.getStyle().BACKGROUND_IMAGE_SCALED_FILL);
         lblPlayerName.setText(tempHashPlayers.get("name").toString());

         } catch (IOException ex) {

         }

         }

         c.getComponentForm().revalidate();

         }*/
    }

    @Override
    protected void onHome_BtnLine1Action(Component c, ActionEvent event) {
        selectedPlayerHashtable = (ParseObject) players.get(selectedProfileIndex);

    }

    @Override
    protected boolean onHomeSearch() {
        boolean flag = false;

        if (findCmbCountry().getSelectedIndex() == 0) {
            flag = true;
            showDialog("Error", "Please select a country before pressing Search.", "Ok", new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                }
            });
        } else if (findCmbLeague().getSelectedIndex() == 0) {
            flag = true;
            showDialog("Error", "Please select a league before pressing Search.", "Ok", new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                }
            });
        } else if (findCmbTeam().getSelectedIndex() == 0) {
            flag = true;
            showDialog("Error", "Please select a team before pressing Search.", "Ok", new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                }
            });
        } else if (findCmbPlayers().getSelectedIndex() == 0) {
            flag = true;
            showDialog("Error", "Please select a player before pressing Search.", "Ok", new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                }
            });
        }

        return flag;

    }

    @Override
    protected boolean onHomeHome() {
        thisForm.setTitle("HOME");
        tracker.setScreenName("HOME");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());
        if (tabs.getSelectedIndex() != 0) {
            tabs.setSelectedIndex(0);
        }
        return true;
    }

    @Override
    protected boolean onHomePlayerSearch() {
        thisForm.setTitle("SEARCH");
        tracker.setScreenName("SEARCH");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());
        if (tabs.getSelectedIndex() != 1) {
            tabs.setSelectedIndex(1);
        }
        return true;
    }

    @Override
    protected boolean onHomeVideo() {
        thisForm.setTitle("VIDEO");
        tracker.setScreenName("VIDEO");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());
        if (tabs.getSelectedIndex() != 2) {
            tabs.setSelectedIndex(2);
        }
        return true;
    }

    @Override
    protected boolean onHomeInformation() {
        thisForm.setTitle("ABOUT");
        tracker.setScreenName("ABOUT");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());
        if (tabs.getSelectedIndex() != 3) {
            tabs.setSelectedIndex(3);
        }
        return true;
    }

    @Override
    protected boolean onHomeContact() {
        thisForm.setTitle("FEEDBACK");
        tracker.setScreenName("FEEDBACK");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());
        if (tabs.getSelectedIndex() != 4) {
            tabs.setSelectedIndex(4);
        }
        return true;
    }

//    @Override
//    protected void beforeTabs(Form f) {
//        Tabs tabs2 = (Tabs)findByName("tabs2", f);
//        tabs2.setSwipeActivated(false);
//        tabs2.getTabsContainer().setLayout(new GridLayout(1, tabs2.getTabsContainer().getComponentCount()));
//        tabs2.getTabsContainer().setScrollableX(false);
//    }
    @Override
    protected void beforeTabs1(Form f) {

    }

    @Override
    protected void beforeDialogTest(Form f) {

        showDialog("Title 1", "Message 1 Message 1 Message 1 Message 1 Message 1", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

            }
        });

    }

    private void showDialog(String title, String message, String closeButton, ActionListener actionListener) {

        Dialog d = (Dialog) createContainer("/theme", "DialogCustom");

        Label lblTitle = (Label) findByName("lblTitle", d);
        SpanLabel lblDescription = (SpanLabel) findByName("lblDescription", d);
        Button btnNo = (Button) findByName("btnNo", d);
        Button btnYes = (Button) findByName("btnYes", d);
        Container parent = btnNo.getParent();
        parent.setLayout(new GridLayout(1, 3));
        parent.removeAll();
        parent.add(new Label(""));
        btnNo.setText(closeButton);
        parent.add(btnNo);

        lblTitle.setText(title);
        lblDescription.setText(message);
        btnYes.addActionListener(actionListener);

        btnNo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

                d.dispose();

            }
        });

        d.show();
    }

    private void showDialog(String title, String message, ActionListener actionListener) {

        Dialog d = (Dialog) createContainer("/theme", "DialogCustom");

        Label lblTitle = (Label) findByName("lblTitle", d);
        SpanLabel lblDescription = (SpanLabel) findByName("lblDescription", d);
        Button btnNo = (Button) findByName("btnNo", d);
        Button btnYes = (Button) findByName("btnYes", d);

        lblTitle.setText(title);
        lblDescription.setText(message);
        btnYes.addActionListener(actionListener);

        btnNo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

                d.dispose();

            }
        });

        d.show();
    }

    @Override
    protected void onHome_BtnLine2Action(Component c, ActionEvent event) {

    }

    @Override
    protected void beforePlayVideoScreen(Form f) {
        playVideoUrl(f, vidName, "video/mp4", name2 + " Top Video", btnLine2);
    }

    String strVidSearch1;

    @Override
    protected boolean onHomeTagSearch() {
        TextField txtVidSearch1 = findTxtVidSearch1();
        strVidSearch1 = txtVidSearch1.getText();

        //Step 1: Validate text
        if (strVidSearch1.length() < 1) {

            showDialog("Search", "Please type in search term", "Close", new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent evt) {

                }
            });
            return false;
        }

        //Step 2: Check if search result exists
        return false;
    }

    @Override
    protected void beforeTabSearch(Form f) {
        Container banner = (Container) findByName("Banner", f);
        generateAd(banner);
        try {

            Tabs tabs2 = (Tabs) findByName("tabs2", f);
            tabs2.setSwipeActivated(false);
            tabs2.getTabsContainer().setLayout(new GridLayout(1, tabs2.getTabsContainer().getComponentCount()));
            tabs2.getTabsContainer().setScrollableX(false);

            //tabs2.setSelectedIndex(2);
            Container contVideos = (Container) findByName("contVideos", f);
            Container contReactions = (Container) findByName("contReactions", f);
            Container contProfiles = (Container) findByName("contProfiles", f);

            contVideos.removeAll();
            contReactions.removeAll();
            contProfiles.removeAll();

            ArrayList players = PlayerModel.playerSearchTerm(strVidSearch1);

            for (int i = 0; i < players.size(); i++) {

                final ParseObject tempHash = (ParseObject) players.get(i);

                //Videos
                Container contVideoItem = (Container) createContainer("/theme", "ContVideoItem");
                Label lblPlayerName = (Label) findByName("lblPlayerName", contVideoItem);

                Container contPlayerVideo = (Container) findByName("contPlayerVideo", contVideoItem);

                final Button btnPlayerVideo = (Button) findByName("btnPlayerVid", contVideoItem);

                btnPlayerVideo.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        String name = tempHash.get("name").toString();
                        String vidName = tempHash.get("vidName").toString();
                        playVideoUrl(null, vidName, "video/mp4", name, btnPlayerVideo);

                    }
                });

                ShareButton shareButtonSocial = (ShareButton) findByName("shareButtonSocial", contVideoItem);
                shareButtonSocial.setTextToShare("Check out the best Soccer 99 app as soon as possible.");

                String name = tempHash.get("name").toString();
                String imageName = tempHash.get("imgName").toString();

                try {
                    InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholder.png");//TEMP
                    EncodedImage placeHolder = EncodedImage.create(is);

                    Image image = URLImage.createToStorage(placeHolder, name, imageName, URLImage.RESIZE_SCALE);

                    lblPlayerName.setText(name);
                    contPlayerVideo.getStyle().setBgImage(image);
                    contPlayerVideo.getStyle().setBackgroundType(contPlayerVideo.getStyle().BACKGROUND_IMAGE_SCALED_FILL);
                    contPlayerVideo.revalidate();

                } catch (IOException ex) {

                }

                contVideos.add(contVideoItem);

                //Reactions
                contVideoItem = (Container) createContainer("/theme", "ContVideoItem");
                lblPlayerName = (Label) findByName("lblPlayerName", contVideoItem);

                contPlayerVideo = (Container) findByName("contPlayerVideo", contVideoItem);

                final Button btnPlayerVideo1 = (Button) findByName("btnPlayerVid", contVideoItem);

                btnPlayerVideo1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        String name = tempHash.get("name").toString();
                        String vidName = tempHash.get("reactionName").toString();
                        playVideoUrl(null, vidName, "video/mp4", name, btnPlayerVideo1);

                    }
                });

                shareButtonSocial = (ShareButton) findByName("shareButtonSocial", contVideoItem);
                shareButtonSocial.setTextToShare("Check out the best Soccer 99 app as soon as possible.");

                name = tempHash.get("name").toString();
                imageName = tempHash.get("imgName").toString();

                try {
                    InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholder.png");//TEMP
                    EncodedImage placeHolder = EncodedImage.create(is);

                    Image image = URLImage.createToStorage(placeHolder, name, imageName, URLImage.RESIZE_SCALE);

                    lblPlayerName.setText(name);
                    contPlayerVideo.getStyle().setBgImage(image);
                    contPlayerVideo.getStyle().setBackgroundType(contPlayerVideo.getStyle().BACKGROUND_IMAGE_SCALED_FILL);
                    contPlayerVideo.revalidate();

                } catch (IOException ex) {

                }

                contReactions.add(contVideoItem);

                //Profiles
                name = tempHash.get("name").toString();
                String imgName = tempHash.get("imgName").toString();
                InputStream is = Display.getInstance().getResourceAsStream(getClass(), "/placeholderSquare.png");//TEMP
                EncodedImage placeHolder = EncodedImage.create(is);
                Image img = URLImage.createToStorage(placeHolder, name, imgName, URLImage.RESIZE_SCALE_TO_FILL);

                Container line0 = new Container(new FlowLayout());
                Label profileIcon = new Label(img);
                line0.add(profileIcon);

                contProfiles.add(line0);
                contProfiles.add(createProfileContainer("Player name", tempHash.get("name").toString()));
                contProfiles.add(createProfileContainer("Team", tempHash.get("team").toString()));
                contProfiles.add(createProfileContainer("Country", tempHash.get("country").toString()));
                contProfiles.add(createProfileContainer("League", tempHash.get("league").toString()));

            }

            System.out.println("players: " + players.size());

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public Container createProfileContainer(String heading, String value) {
        Container line1 = new Container(new FlowLayout());
        Label col1 = new Label();
        Label col2 = new Label();
        col1.setUIID("Label");
        col2.setUIID("LabelWhite");
        col1.setText(heading);
        col2.setText(value);
        line1.add(col1);
        line1.add(col2);
        return line1;
    }

//    @Override
//    protected void onCMS_BtnGoogleAnalyticsAction(Component c, ActionEvent event) {
//
//        Display.getInstance().execute("https://analytics.google.com");
//
//    }
    @Override
    protected void beforeCMS(final Form f) {

        Tabs tabsCMS = (Tabs) findByName("Tabs", f);
        AfroUtility.setupTabs(tabsCMS);

        tabsCMS.addSelectionListener(new SelectionListener() {

            @Override
            public void selectionChanged(int oldSelected, int newSelected) {

                if (newSelected == 2) {

                    Dialog.show("Please visit", "https://analytics.google.com", "Ok", null);
                }

            }
        });

        tabsCMS.setSelectedIndex(1);
        final List listPlayers = (List) findByName("ListPlayers", f);
        final List listAdverts = (List) findByName("ListAdverts", f);

        listPlayers.setModel(new DefaultListModel(RenderTransformer.getPlayers(players)));
        listPlayers.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

                selectedPlayerHash = (Hashtable) listPlayers.getSelectedItem();
                Image img = (Image) selectedPlayerHash.get("icon");
                Log.p("Player clicked: " + img.getWidth(), Log.DEBUG);

            }
        });

        listAdverts.setModel(new DefaultListModel(RenderTransformer.getAdverts(adverts)));
        listAdverts.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

                selectedAdvertHash = (Hashtable) listAdverts.getSelectedItem();
                String objectId = (String) selectedAdvertHash.get("objectId");
                Image img = (Image) selectedAdvertHash.get("icon");
                String name = (String) selectedAdvertHash.get("name");
                String clickUrl = (String) selectedAdvertHash.get("clickUrl");
                final Advert advert = (Advert) selectedAdvertHash.get("advert");
                final ParseObject parseObjectAdvert = advert.getParseObject();
                boolean isEnabled = parseObjectAdvert.getBoolean("isEnabled");

                Form formNewAdvert = (Form) createContainer("/theme", "CMS - New Advert");
                Command back = new Command("Back") {

                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        f.showBack();

                    }

                };
                formNewAdvert.setBackCommand(back);

                final TextField txtName = (TextField) findByName("txtName", formNewAdvert);
                final TextArea txtClickUrl = (TextArea) findByName("txtClickUrl", formNewAdvert);
                final Label lblExistingImage = (Label) findByName("lblExistingImage", formNewAdvert);
                final OnOffSwitch OnOffSwitch = (OnOffSwitch) findByName("OnOffSwitch", formNewAdvert);
                final Button btnUploadImg = (Button) findByName("btnUploadImg", formNewAdvert);
                final Label lblImagePreview = (Label) findByName("lblImagePreview", formNewAdvert);
                final Label lblNewImage = (Label) findByName("lblNewImage", formNewAdvert);
                final Button btnSave = (Button) findByName("btnSave", formNewAdvert);

                txtName.setText(name);
                txtClickUrl.setText(clickUrl);
                OnOffSwitch.setValue(isEnabled);
                lblExistingImage.setIcon(img);
                lblExistingImage.setText("");

                btnUploadImg.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        Display.getInstance().openGallery(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                try {
                                    tempUri = evt.getSource().toString();
                                    Image img = Image.createImage(tempUri);
                                    lblNewImage.setIcon(img);
                                    lblNewImage.getComponentForm().revalidate();
                                } catch (IOException ioe) {
                                    Log.p("beforeCMS(..)-> upload img: " + ioe, Log.DEBUG);
                                }
                            }
                        }, Display.GALLERY_IMAGE);
                    }
                });

                btnSave.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        ParseUser login = UserService.userLogin("blessing@mfactory.mobi", "12345");

                        ParseUser user = ParseUser.getCurrent();

                        parseObjectAdvert.put("name", txtName.getText());
                        parseObjectAdvert.put("clickUrl", txtClickUrl.getText());
                        parseObjectAdvert.put("objectIdUser", user.getObjectId());
                        parseObjectAdvert.put("isEnabled", OnOffSwitch.isValue());


                        if(tempUri != null){
                            Advert advert = AfroUtility.uploadImage(tempUri);
                            parseObjectAdvert.put("imageUrl", advert.getImageUrl());
                            parseObjectAdvert.put("imageRaw", advert.getFile());
                        }
                        
                        tempUri = null;

                        try {
                            parseObjectAdvert.save();
                            Log.p("Ad clicked: saved objectId=" + parseObjectAdvert.getObjectId(), Log.DEBUG);

                            for(int i = 0; i < adverts.size(); i++){
                                Advert tempAdvertObject = (Advert)adverts.get(i);
                                ParseObject tempAdvert = tempAdvertObject.getParseObject();
                                if(OnOffSwitch.isValue() == true && !parseObjectAdvert.getObjectId().equals(tempAdvert.getObjectId())){
                                    //reset all Advert objects
                                    //TODO move to cloud
                                    tempAdvert.put("isEnabled", false);
                                    tempAdvert.save();
                                }
                            }
                            
                            Log.p("Ad clicked: saved objectId=" + parseObjectAdvert.getObjectId(), Log.DEBUG);

                            
                            Dialog.show("Updated", "Advert has been updated.", "Ok", null);
                            
                            
                            

                        } catch (ParseException e) {
                            Log.p("Ad clicked: ParseException=" + e.getMessage(), Log.DEBUG);
                        }
                    }
                });

                formNewAdvert.show();

                Log.p("Ad clicked: " + img.getWidth(), Log.DEBUG);
            }
        });

        f.revalidate();
    }

    @Override
    protected void onCMS_BtnNewPlayerAction(Component c, ActionEvent event) {

        thisForm = c.getComponentForm();

        Form f = (Form) createContainer("/theme", "CMS - New Player");
        Command back = new Command("Back") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                thisForm.showBack();

            }

        };
        f.setBackCommand(back);

        f.show();

    }

    @Override
    protected void onCMS_BtnNewAdvertAction(Component c, ActionEvent event) {

        thisForm = c.getComponentForm();

        Form f = (Form) createContainer("/theme", "CMS - New Advert");

        final TextField txtName = (TextField) findByName("txtName", f);
        final TextArea txtClickUrl = (TextArea) findByName("txtClickUrl", f);
        final Container contSwitch = (Container) findByName("contSwitch", f);
        final Label lblExistingImage = (Label) findByName("lblExistingImage", f);
        final Button btnUploadImg = (Button) findByName("btnUploadImg", f);
        final Label lblImagePreview = (Label) findByName("lblImagePreview", f);
        final Label lblNewImage = (Label) findByName("lblNewImage", f);
        final Button btnSave = (Button) findByName("btnSave", f);

        f.removeComponent(contSwitch);
        f.removeComponent(lblExistingImage);
        f.revalidate();

        btnUploadImg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Display.getInstance().openGallery(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        try {
                            tempUri = evt.getSource().toString();
                            Image img = Image.createImage(tempUri);
                            lblNewImage.setIcon(img);
                            lblNewImage.getComponentForm().revalidate();
                        } catch (IOException ioe) {
                            Log.p("beforeCMS(..)-> upload img: " + ioe, Log.DEBUG);
                        }
                    }
                }, Display.GALLERY_IMAGE);
            }
        });

        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {

                ParseUser login = UserService.userLogin("blessing@mfactory.mobi", "12345");

                ParseUser user = ParseUser.getCurrent();

                ParseObject parseObjectAdvert = ParseObject.create("Advert");

                parseObjectAdvert.put("name", txtName.getText());
                parseObjectAdvert.put("clickUrl", txtClickUrl.getText());
                parseObjectAdvert.put("objectIdUser", user.getObjectId());
                parseObjectAdvert.put("isEnabled", false);

                Advert advert = AfroUtility.uploadImage(tempUri);

                parseObjectAdvert.put("imageUrl", advert.getImageUrl());
                parseObjectAdvert.put("imageRaw", advert.getFile());

                try {
                    parseObjectAdvert.save();
                    Log.p("New Advert: saved objectId=" + parseObjectAdvert.getObjectId(), Log.DEBUG);

                    Dialog.show("Updated", "Advert has been saved.", "Ok", null);

                } catch (ParseException e) {
                    Log.p("New Advert: ParseException=" + e.getMessage(), Log.DEBUG);
                }
            }
        });

        Command back = new Command("Back") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                thisForm.showBack();

            }

        };
        f.setBackCommand(back);
        f.show();

    }

    @Override
    protected boolean onLoginLogin() {

        ParseUser user = UserService.userLogin(findTxtEmail().getText(), findTxtPassword().getText());

        if (user == null) {
            Dialog.show("Error", "Invalid Email / Password", "Ok", null);
            return true;
        }

        return false;
    }
}
