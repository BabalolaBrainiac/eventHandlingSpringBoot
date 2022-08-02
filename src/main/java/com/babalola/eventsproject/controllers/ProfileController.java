package com.babalola.eventsproject.controllers;

import com.babalola.eventsproject.services.ProfileInterfaceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class ProfileController {

    private final ProfileInterfaceImpl profileInterface;

    public ProfileController(ProfileInterfaceImpl profileInterface) {
        this.profileInterface = profileInterface;
    }

    @GetMapping("/")
    public String indexPage() {
        return "Welcome to event handling testing";

    }

    @GetMapping("/name")
    public String getProfileName(){
        return profileInterface.getName();
    }

    @GetMapping("/payload")
    public String getPayload() {
        return profileInterface.getPayload();
    }


    @GetMapping("/date")
    public Date getProfileDate(){
        return profileInterface.getDate();
    }


    @GetMapping("/device")
    public String getDescription(){
        return profileInterface.getDescription();
    }
}
