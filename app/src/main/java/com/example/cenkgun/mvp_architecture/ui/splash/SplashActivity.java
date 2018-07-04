package com.example.cenkgun.mvp_architecture.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cenkgun.mvp_architecture.R;
import com.example.cenkgun.mvp_architecture.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity implements SplashView {

    SplashPresenterImpl mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mSplashPresenter = new SplashPresenterImpl<>();
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        /*Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();*/
    }
}
