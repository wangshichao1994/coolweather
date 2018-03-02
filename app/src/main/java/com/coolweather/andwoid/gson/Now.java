package com.coolweather.andwoid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangshichao on 2018/3/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
