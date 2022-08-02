package com.babalola.eventsproject.events;
import org.springframework.context.ApplicationEvent;

public class GetNameEvent extends ApplicationEvent {

    String name;
    String description;
    String payLoad;

    public GetNameEvent(Object event, String name, String description, String payLoad) {
        super(event);
        this.name = name;
        this.description = description;
        this.payLoad = payLoad;
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

    public GetNameEvent(Object event) {
        super(event);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
