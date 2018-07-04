package com.example.cenkgun.mvp_architecture.data;

import com.example.cenkgun.mvp_architecture.models.SessionModel;

/**
 * Created by cenkgun on 3.07.2018.
 */

public interface Session {
    void saveSession(SessionModel sessionModel);
    void deleteSession();
}
