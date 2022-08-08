package com.babalola.eventsproject.events;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.*;
import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Data
@Builder
@NoArgsConstructor
@ToString(callSuper = true)
@Component
public class EventEntityDBO{

    private String title;
    private JSONObject payload;

    public EventEntityDBO(String title, JSONObject payload) {
        this.title = title;
        this.payload = payload;
    }

    public EventEntityDBO(EventEntityDBO event) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JSONObject getPayload() {
        return payload;
    }

    public void setPayload(JSONObject payload) {
        this.payload = payload;
    }

    public EventEntityDBO(JSONObject payload) {
        this.payload = payload;
    }
}

