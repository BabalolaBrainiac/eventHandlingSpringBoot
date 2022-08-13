package com.babalola.eventsproject.events;
import com.google.gson.JsonObject;
import lombok.*;
import org.json.JSONObject;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@ToString(callSuper = true)
@Component
@Builder
public class EventEntityDBO{
    private String title;
    private JsonObject payload;
    public EventEntityDBO(String title, JsonObject payload) {
        this.title = title;
        this.payload = payload;
    }

    public EventEntityDBO(String title, Object payload) {
        this.title = title;
        this.payload = (JsonObject) payload;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JsonObject getPayload() {
        return this.payload;
    }

    public EventEntityDBO(JsonObject payload) {
        this.payload = payload;
    }
}

