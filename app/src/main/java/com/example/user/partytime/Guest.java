package com.example.user.partytime;

class Guest {
    private String name;
    private String phoneNo;
    private boolean attending;

    public Guest(String name, String phoneNo, boolean attending) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.attending = attending;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isAttending() {
        return attending;
    }

    public void setAttending(boolean attending) {
        this.attending = attending;
    }
}
