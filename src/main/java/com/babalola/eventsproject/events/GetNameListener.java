package com.babalola.eventsproject.events;
import com.babalola.eventsproject.services.UrlExtractor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;;
import org.apache.http.HttpEntity;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Slf4j
@Component
@RequiredArgsConstructor
public class GetNameListener {

    private final EventPublisher eventPublisher;

    private final UrlExtractor urlExtractor;

    @Async
    @EventListener
    public String handleGetNameEvent(GetNameEvent event) throws IOException {
        System.out.println(event.getPayload());
        System.out.println(event.getTitle());

        //send to webhook
        urlExtractor.sendPostRequest(event.getWebhookUrl(), event.getPayload());
        return event.getTitle();

    }



}
