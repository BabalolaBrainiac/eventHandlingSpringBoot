package com.babalola.eventsproject.services;


import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProfileInterfaceImpl implements ProfileInterface {
    @Override
    public String getName() {
        return "This a named profile event";
    }

    @Override
    public String getDevice() {
        return "This device is a macbook";
    }

    @Override
    public String getDate() {
        return "Todays date is" + new Date().toString();
    }
}
