package com.coolweather.andwoid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangshichao on 2018/3/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
