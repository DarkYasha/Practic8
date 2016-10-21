package edu.tecii.android.tipcalc01;

import android.app.Application;

/**
 * Created by Warmab on 9/8/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://imgur.com/momos";

    public  String getAboutUrl() {
        return ABOUT_URL;
    }
}
