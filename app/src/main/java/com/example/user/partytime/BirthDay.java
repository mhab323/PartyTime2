package com.example.user.partytime;

import java.io.Serializable;
import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * birthday class has five fields: name date address arraylist<item> arraylis<guest>
 */

public class BirthDay implements Serializable {
    private String name;
    private String date;
    private String address;

    private ArrayList<Item> items;
    private ArrayList<Guest> guests;

    /**
     * constructor builds new object with 3 parameters
     * @param name
     * @param date
     * @param address
     */
    public BirthDay(String name, String date, String address) {
        this.date = date;
        this.name = name;
        this.address = address;

        items = new ArrayList<>();
        guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String day) {
        this.name = day;
    }

    public String getPlace() {
        return address;
    }

    public void setPlace(String place) {
        this.address = place;
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

    public void addGuest(ArrayList<Guest> guests){
        guests.addAll(guests);
    }
    public void addItem(Item item){
        items.add(item);
    }
}





