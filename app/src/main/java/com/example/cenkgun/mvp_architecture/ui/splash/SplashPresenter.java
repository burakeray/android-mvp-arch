package com.example.cenkgun.mvp_architecture.ui.splash;

import com.example.cenkgun.mvp_architecture.ui.base.MVPPresenter;

/**
 * Created by cenkgun on 3.07.2018.
 */

public interface SplashPresenter<V extends SplashView> extends MVPPresenter<V> {

    void decideNextActivity();
}
