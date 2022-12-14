package com.example.mailsender_java_live_project.model;

public class User {

    private String name;

    private String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @Override
    public String toString() {

        return "User [name=" + name + ", address = " + emailAddress + "]";
    }
}
