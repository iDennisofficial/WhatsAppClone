package com.example.whatsappclone;

public class StatusModel {

    private int imageID;
    private String name, time;

    public StatusModel(int imageID, String name, String time) {
        this.imageID = imageID;
        this.name = name;
        this.time = time;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
