package com.example.sey.usersapp.mods_data;

import java.util.ArrayList;

public class User {
    private String Name, Phone, Email, AvatUrl;
    private ArrayList<Message> messages;

    public User() {
    }

    public User(String name, String phone, String email, String avatUrl) {
        Name = name;
        Phone = phone;
        Email = email;
        AvatUrl = avatUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAvatUrl() {
        return AvatUrl;
    }

    public void setAvatUrl(String avatUrl) {
        AvatUrl = avatUrl;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
