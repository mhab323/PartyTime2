package com.example.user.partytime;

import java.util.ArrayList;

public class BirthDay {
    private String date;
    private String image;
    private ArrayList<String> guests;
    private ArrayList<ToDo> toDos;

    public BirthDay(String date, String image, ArrayList<String> guests, ArrayList<ToDo> toDos) {
        this.date = date;
        this.image = image;
        this.guests = guests;
        this.toDos = toDos;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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
