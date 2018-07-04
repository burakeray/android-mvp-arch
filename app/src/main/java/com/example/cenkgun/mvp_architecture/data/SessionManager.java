package com.example.cenkgun.mvp_architecture.data;

import com.example.cenkgun.mvp_architecture.models.SessionModel;

/**
 * Created by cenkgun on 3.07.2018.
 */

public final class SessionManager implements Session {

    private static String SESSION_KEY = "SESSION_KEY";
    private static final SessionManager ourInstance = new SessionManager();

    public static SessionManager getInstance() {
        return ourInstance;
    }

    private SessionManager() {
    }

    @Override
    public void saveSession(SessionModel sessionModel) {
        SharedPrefsHelper.getInstance().put(SESSION_KEY, sessionModel);
    }

    @Override
    public void deleteSession() {

    }
}
