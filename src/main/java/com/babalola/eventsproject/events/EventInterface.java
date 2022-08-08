package com.babalola.eventsproject.events;

public interface EventInterface {

    public void getTitle();
    public void getPayload();

    public void setTitle();

    public default void setPayload(String payload) {
        this.setPayload(payload);

    };

}
