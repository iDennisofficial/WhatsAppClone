package com.example.whatsappclone;

public class CallsModel {

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalLType() {
        return CalLType;
    }

    public void setCalLType(String calLType) {
        CalLType = calLType;
    }

    public CallsModel(int imageID, String name, String calLType) {
        this.imageID = imageID;
        this.name = name;
        CalLType = calLType;
    }

    private int imageID;
    private String name, CalLType;
}
