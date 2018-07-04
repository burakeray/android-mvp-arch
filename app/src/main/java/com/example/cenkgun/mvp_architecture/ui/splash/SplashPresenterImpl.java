package com.example.cenkgun.mvp_architecture.ui.splash;

import com.example.cenkgun.mvp_architecture.ui.base.BasePresenter;

/**
 * Created by cenkgun on 3.07.2018.
 */

public class SplashPresenterImpl<V extends SplashView> extends BasePresenter<V> implements SplashPresenter<V> {

    @Override
    public void decideNextActivity() {
        getMvpView().openMainActivity();
    }
}
