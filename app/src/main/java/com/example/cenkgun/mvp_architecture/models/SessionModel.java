package com.example.cenkgun.mvp_architecture.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by cenkgun on 3.07.2018.
 */

public class SessionModel {

    @SerializedName("name")
    public String name;

    @SerializedName("surName")
    public String surName;

    @SerializedName("uniqueID")
    public Long uniqueID;

    @SerializedName("loginDate")
    public Date loginDate;
}
