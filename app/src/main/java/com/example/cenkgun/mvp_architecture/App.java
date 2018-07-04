package com.example.cenkgun.mvp_architecture;

import android.app.Application;

import com.example.cenkgun.mvp_architecture.data.SharedPrefsHelper;

/**
 * Created by cenkgun on 3.07.2018.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPrefsHelper.init(this);
    }
}
