package com.example.splash_learn;

public class Contestentinfo {
    String name,email,collegename;

    public Contestentinfo(String name, String email, String collegename) {
        this.name = name;
        this.email = email;
        this.collegename = collegename;
    }

    public Contestentinfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
}
