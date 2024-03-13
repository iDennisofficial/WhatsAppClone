package com.example.whatsappclone;

public class ChatModel {

    private int imageID;
    private String name, message;

    public ChatModel(int imageID, String name, String message) {
        this.imageID = imageID;
        this.name = name;
        this.message = message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
