package com.example.cenkgun.mvp_architecture.ui.base;

/**
 * Created by cenkgun on 3.07.2018.
 */

public interface MVPPresenter<V extends MVPView> {

    void onAttach(V mvpView);
}
