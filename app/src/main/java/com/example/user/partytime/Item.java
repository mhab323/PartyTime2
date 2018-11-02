package com.example.user.partytime;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Item implements Serializable{
    private Bitmap image;
    private String name;

    public Item(Bitmap image, String name) {
        this.image = image;
        this.name = name;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
