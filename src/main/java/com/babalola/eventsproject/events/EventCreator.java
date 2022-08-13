package com.babalola.eventsproject.events;
import com.google.gson.JsonObject;

public class EventCreator {
    public String webhookUrl;
    EventEntityDBO event;

    public EventCreator(EventEntityDBO event, String userWebhookUrl) {
        this.event = event;
        this.webhookUrl = userWebhookUrl;
    }

    public String getTitle() {
        return event.getTitle();
    }
    public JsonObject getPayload() {
        return event.getPayload();
    }
}
