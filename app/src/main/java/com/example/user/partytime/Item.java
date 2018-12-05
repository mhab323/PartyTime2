package com.example.user.partytime;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Item implements Serializable{
    private String image;

    public Item(String name) {
        this.name = name;
    }

    private String name;

    public Item(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
