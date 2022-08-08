package com.babalola.eventsproject.events;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Component
@Order(100)
@RequiredArgsConstructor
public class EventCreator {

    public void CreateEvent(Event eventType, String payload) {
        Event event = new Event();
        event.setPayload(payload);
        System.out.println(event.getPayload());
    }
}
