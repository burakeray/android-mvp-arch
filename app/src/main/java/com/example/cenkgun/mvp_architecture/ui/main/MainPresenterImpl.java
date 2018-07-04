package com.example.cenkgun.mvp_architecture.ui.main;

import com.example.cenkgun.mvp_architecture.ui.base.BasePresenter;

/**
 * Created by cenkgun on 4.07.2018.
 */

public class MainPresenterImpl<V extends MainView> extends BasePresenter<V> implements MainPresenter<V> {

    @Override
    public String getEmailId() {
        return null;
    }

    @Override
    public void setUserLoggedOut() {

    }
}
