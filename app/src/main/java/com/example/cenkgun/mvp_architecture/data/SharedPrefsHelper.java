package com.example.cenkgun.mvp_architecture.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by cenkgun on 3.07.2018.
 */

public final class SharedPrefsHelper {

    private static final String MY_PREFS = "MY_PREFS";
    private static SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper();
    private static SharedPreferences sharedPreferences;
    private static Gson gson;

    private SharedPrefsHelper() {

    }

    public static SharedPrefsHelper getInstance() {
        return sharedPrefsHelper == null ? new SharedPrefsHelper() : sharedPrefsHelper;
    }

    public static void init(Context context) {
        gson = new Gson();
        sharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void put(String key, Object value) {
        String json = gson.toJson(value);
        sharedPreferences.edit().putString(key, json).apply();
    }

    public <T> T get(String key, Class<T> clazz) {
        String json = sharedPreferences.getString(key, "");
        return gson.fromJson(json, clazz);
    }

    public void clear() {
        sharedPreferences.edit().clear().apply();
    }
}
