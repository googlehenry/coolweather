package com.example.coolWeather.gson;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature tempreature;

    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
