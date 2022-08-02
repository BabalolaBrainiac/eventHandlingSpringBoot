package com.babalola.eventsproject.services;

import java.util.Date;

public class SampleObject {
    String name;
    String description;
    String payload;
    Date date;

    public SampleObject(String name, String description, String payload, Date date) {
        this.name = name;
        this.description = description;
        this.payload = payload;
        this.date = date;
    }

    public SampleObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
