package com.babalola.eventsproject.events;
import com.babalola.eventsproject.services.SampleObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GetNameListener implements ApplicationListener<GetNameEvent> {

    @Override
    public void onApplicationEvent(GetNameEvent event) {
        System.out.println(event.getName());
        System.out.println(event.getDescription());
        System.out.println(event.getPayLoad());

        //Perform logic to push event properties to webhook;

        log.info("get name event is being listened to");
    }
}
