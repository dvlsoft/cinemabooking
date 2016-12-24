package com.cinema.entity;

/**
 * Created by taras on 24.12.16.
 */
public class Movie {
    private String title;
    private String desc;
    private String urlPicture;
    private String rate;

    public Movie(String title, String desc, String urlPicture, String rate) {
        this.title = title;
        this.desc = desc;
        this.urlPicture = urlPicture;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public String getRate() {
        return rate;
    }
}
