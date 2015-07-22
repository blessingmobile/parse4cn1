/*
 * Copyright 2015 Chidiebere Okwudire.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.parse4cn1.test.javaapplication;

import com.codename1.ui.Display;
import com.parse4cn1.ParseException;
import com.parse4cn1.BaseParseTest;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.reflections.Reflections;

/**
 * A simple test app to illustrate how to create a regular Java application
 * using parse4cn1.jar.
 *
 * It executes the Parse4CN1 tests written using CodenameOne's (Java) test
 * library.
 *
 * @author sidiabale
 */
public class CN1TestJavaApplication {

    /**
     * A helper class to initialize the application's main frame.
     */
    public static class MainFrame extends JFrame {

        public MainFrame() {
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            BorderLayout layout = new BorderLayout();
            getContentPane().setLayout(layout);
            this.setSize(new Dimension(500, 500));
            this.setPreferredSize(new Dimension(500, 500));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        createAppWithoutProperContext();
        createAppWithProperContext(false);
    }

    private static void createAppWithoutProperContext() {
        // This approach is handy for a non-GUI application
        Display.init(null);
        runTests();
        Display.getInstance().exitApplication();
    }

    private static void createAppWithProperContext(final boolean aShowFrame) {
        // This approach is recommended for a GUI-application or in the case
        // where the blank frame shown for createAppWithoutProperContext() is an issue.
        final JFrame f = new MainFrame();
        Display.init(f.getContentPane());

        Display.getInstance().callSeriallyAndWait(new Runnable() {

            @Override
            public void run() {
                f.setVisible(aShowFrame);
                runTests();
                // Close frame
                f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
            }
        });
    }

    private static void runTests() {
        // Auto-detect defined test classes
        // cf. lib/reflections-0.9.9-RC1-uberjar.jar and its dependencies 
        // (lib/javassist.jar, lib/guava-18.0.jar)
        Reflections reflections = new Reflections("com.parse4cn1");
        final Set<Class<? extends BaseParseTest>> testClasses
                = reflections.getSubTypesOf(BaseParseTest.class);

        final int testCount = testClasses.size();
        System.out.println("Testing Java application based on CN1 Parse port!!!");
        System.out.println("About to run " + testCount + " tests...\n");

        int counter = 1;
        List<String> failedTests = new ArrayList<String>();
        for (Class<? extends BaseParseTest> testClass : testClasses) {
            
//            /*
//             Filter for running subsets of tests if necessary (particularly useful since 
//             at the time of writing, the CN1 test runner lacks this functionality
//             see: https://groups.google.com/d/msg/codenameone-discussions/WVO8xrRvo3I/dklQXs6m4v4J)
//             */
//            if (!testClass.getCanonicalName().endsWith("ParseBatchTest")) {
//                System.err.println("Ignoring test " + testClass.getCanonicalName());
//                continue;
//            }

            try {
                failedTests.add(testClass.getCanonicalName());

                System.out.println("\n:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:");
                System.out.println("Running test " + counter + "/" + testCount
                        + ": " + testClass.getCanonicalName());
                System.out.println(":=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:");
                ++counter;

                BaseParseTest test = (BaseParseTest) testClass.newInstance();
                test.prepare();
                final boolean result = test.runTest();

                test.cleanup();

                if (result) {
                    failedTests.remove(testClass.getCanonicalName());
                }
            } catch (ParseException ex) {
                Logger.getLogger(CN1TestJavaApplication.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(CN1TestJavaApplication.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                System.out.println("\n:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:");
                System.out.println("Test: " + testClass.getCanonicalName()
                        + " " + (!failedTests.contains(testClass.getCanonicalName()) ? "PASSED" : "FAILED"));
                System.out.println(":=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:");
            }
        }

        if (failedTests.isEmpty()) {
            System.out.println("\nALL tests passed!!!");
        } else {
            System.err.println("\nThe following tests failed:\n" + failedTests);
        }
    }
}
