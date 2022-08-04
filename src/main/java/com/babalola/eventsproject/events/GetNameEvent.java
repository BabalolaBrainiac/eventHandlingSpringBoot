package com.babalola.eventsproject.events;
import org.springframework.context.ApplicationEvent;

public class GetNameEvent extends ApplicationEvent {
    String name;
    String description;
    String payLoad;

    //constructor to create event with all event properties
    public GetNameEvent(Object event, String name, String description, String payLoad) {
        super(event);
        this.name = name;
        this.description = description;
        this.payLoad = payLoad;
    }
    //Constructor to create event with just the event object
    public GetNameEvent(Object event) {
        super(event);
    }


    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public String getPayLoad() {
        return payLoad;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
