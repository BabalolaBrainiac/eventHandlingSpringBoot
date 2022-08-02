package com.babalola.eventsproject.services;
import com.babalola.eventsproject.events.GetNameEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class ProfileInterfaceImpl implements ProfileInterface{

    public ProfileInterfaceImpl(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    private final ApplicationEventPublisher applicationEventPublisher;

    String name;
    String description;
    String payload;
    Date date;

    public String getName() {

        SampleObject sampleObject = new SampleObject("Sample Get Request", "Testing",
                "Whatever is being sent as request payload", new Date());

        GetNameEvent getNameEvent = new GetNameEvent(sampleObject);
        applicationEventPublisher.publishEvent(getNameEvent);
        return "This is a sample request event";
    }
    public String getDescription() {
        return "This is the description of this event";
    }

    public String getPayload() {
        return "This is the payload of this event";
    }

    public Date getDate() {
        return date;
    }

}
