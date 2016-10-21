package com.tec2.android.tipcalc;

import android.app.Application;

/**
 * Created by Dark Dragon on 16/09/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://imgur.com/";

    public  String getAboutUrl() {
        return ABOUT_URL;
    }
}
