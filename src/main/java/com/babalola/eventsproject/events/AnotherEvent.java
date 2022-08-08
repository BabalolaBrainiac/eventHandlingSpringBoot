package com.babalola.eventsproject.events;


import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class AnotherEvent {

    EventEntityDBO anotherEvent;
}
