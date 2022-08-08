package com.babalola.eventsproject.services;

public class User {

    private String name;

    private String webHookUrl;

    public User(String name, String webHookUrl) {
        this.name = name;
        this.webHookUrl = webHookUrl;
    }

    public String getName() {
        return name;
    }


    public String getWebHookUrl() {
        return webHookUrl;
    }

}
