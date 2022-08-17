package com.babalola.eventsproject.services;
import com.babalola.eventsproject.events.*;
import com.babalola.eventsproject.publisher.EventPublisher;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
@Slf4j
@Component
@Order(100)
@RequiredArgsConstructor
public class ProfileInterfaceImpl implements ProfileInterface{
    String name;
    String description;
    String payload;
    Date date;

  private final EventPublisher eventPublisher;

    public String getName(EventEntityDBO event) {
        return event.getTitle();
    }

    @Async
    public String testingApplication() {
        String userAssetRequestId;
        String userWebhookUrl;
        JSONArray userAssets = new JSONArray();


        userAssets.put("ETH: Ethereum");
        userAssets.put("BNB: Binance Smart Chain");
        userAssetRequestId = "sampleUser001_2022_13_August";
        userWebhookUrl = "https://webhook.site/379a2800-4a23-437a-8acc-b3aa25df7eb2";


        JsonObject samplePayload = new JsonObject();
        samplePayload.addProperty("isAuthComplete", "sampleUser001");
        samplePayload.addProperty("ordersCompleted", 40);



        EventEntityDBO event = new EventEntityDBO("testing.new.event.title", samplePayload);
        eventPublisher.publishEvent(new EventCreator(event, userWebhookUrl));




//        eventEntityDBO.setPayload("My payload");
//        eventEntityDBO.setTitle("My title");
//        eventPublisher.publishEvent(eventEntityDBO);


        return userAssetRequestId;
    }

    public void test() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    public String getPayload() {
        return "This is the payload of this event";
    }

    public Date getDate() {
        return date;
    }

}
