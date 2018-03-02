package com.coolweather.andwoid.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wangshichao on 2018/3/1.
 */

public class Weather {
    public String status;
    public Basic basicl;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forcast")
    public List<Forecast> forecastList;
}
