package com.example.cenkgun.mvp_architecture.ui.base;

/**
 * Created by cenkgun on 3.07.2018.
 */

public class BasePresenter<V extends MVPView> implements MVPPresenter<V> {

    private V mMvpView;

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

}
