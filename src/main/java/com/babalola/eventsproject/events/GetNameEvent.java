package com.babalola.eventsproject.events;
import lombok.Value;
import org.json.JSONObject;


@Value
public class GetNameEvent{

    EventEntityDBO getNameEvent;

    public String webhookUrl;

    public JSONObject getPayload() {
        return getNameEvent.getPayload();
    }

    public String getTitle() {
        return getNameEvent.getTitle();
    }

}
