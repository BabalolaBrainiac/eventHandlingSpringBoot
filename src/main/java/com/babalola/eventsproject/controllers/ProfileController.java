package com.babalola.eventsproject.controllers;

import com.babalola.eventsproject.services.ProfileInterfaceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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


    @GetMapping("/date")
    public String getProfileDate(){
        return profileInterface.getDate();
    }


    @GetMapping("/device")
    public String getProfileDevice(){
        return profileInterface.getDevice();
    }
}
