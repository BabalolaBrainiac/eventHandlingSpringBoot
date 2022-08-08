package com.babalola.eventsproject.events;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class AnotherEventListener {


    @EventListener
    @Async
    public void listenToAnotherEvent(AnotherEvent event) {
        System.out.println("this is a totally different event");

    }
}
