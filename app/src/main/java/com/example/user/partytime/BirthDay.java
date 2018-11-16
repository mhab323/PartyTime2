package com.example.user.partytime;

import java.io.Serializable;
import java.security.PrivateKey;
import java.util.ArrayList;

public class BirthDay implements Serializable {
    private String date;
    private String day;
    private String place;
    private  String street;

    public BirthDay(String date, String day, String place, String street) {
        this.date = date;
        this.day = day;
        this.place = place;
        this.street = street;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }



    public BirthDay(String date, int image) {
        this.date = date;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}





