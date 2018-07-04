package com.example.cenkgun.mvp_architecture.ui.main;

import com.example.cenkgun.mvp_architecture.ui.base.MVPPresenter;

/**
 * Created by cenkgun on 4.07.2018.
 */

public interface MainPresenter<V extends MainView> extends MVPPresenter<V> {
    String getEmailId();

    void setUserLoggedOut();
}
