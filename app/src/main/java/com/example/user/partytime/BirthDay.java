package com.example.user.partytime;

import java.util.ArrayList;

public class BirthDay {
    private String date;
    private int image;
    private ArrayList<String> guests;
    private ArrayList<ToDo> toDos;

    public BirthDay(String date, int image, ArrayList<String> guests, ArrayList<ToDo> toDos) {
        this.date = date;
        this.image = image;
        this.guests = guests;
        this.toDos = toDos;
    }

    public BirthDay(String date, int image) {
        this.date = date;
        this.image=image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ArrayList<String> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<String> guests) {
        this.guests = guests;
    }

    public ArrayList<ToDo> getToDos() {
        return toDos;
    }

    public void setToDos(ArrayList<ToDo> toDos) {
        this.toDos = toDos;
    }
}
