package com.babalola.eventsproject.listener;
import com.babalola.eventsproject.events.EventCreator;
import com.babalola.eventsproject.eventHelpers.UrlExtractor;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventCreatorListener {
    private final UrlExtractor urlExtractor;

    @Async
    @EventListener
    public void handleAllEvents(EventCreator event) throws IOException, JSONException {
        System.out.println(event.getTitle());
        System.out.println(event.getPayload());
        System.out.println(event.webhookUrl);

        JsonObject newPayload = new JsonObject();
        newPayload.addProperty("title", event.getTitle());
        newPayload.add("data", event.getPayload());
        System.out.println("event created and being listened to");


        urlExtractor.sendPostRequest(event.webhookUrl, newPayload);
    }
}
