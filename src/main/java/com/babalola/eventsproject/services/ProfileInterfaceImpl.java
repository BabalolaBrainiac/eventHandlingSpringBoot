package com.babalola.eventsproject.services;
import com.babalola.eventsproject.events.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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



    public String getName(GetNameEvent event) {
        EventEntityDBO eventEntityDBO = null;
        eventEntityDBO.setTitle("babalola.title.test");


        return "Get name event created";
    }


    @Async
    public String testingApplication() throws JSONException {
        String userAssetRequestId;
        String userWebhookUrl;
        JSONArray userAssets = new JSONArray();
        userAssets.put("ETH: Ethereum");
        userAssets.put("BNB: Binance Smart Chain");
        userAssetRequestId = "sampleUser001_2022_13_August";
        userWebhookUrl = "https://webhook.site/379a2800-4a23-437a-8acc-b3aa25df7eb2";

        JSONObject samplePayload = new JSONObject();
        samplePayload.put("userId", "sampleUser001");
        samplePayload.put("ordersCompleted", 40);
        samplePayload.put("availableAssets", userAssets);

        EventEntityDBO event = new EventEntityDBO(userAssetRequestId, samplePayload);
        eventPublisher.publishEvent(new GetNameEvent(event, userWebhookUrl));
        return "event created and published";


//        eventEntityDBO.setPayload("My payload");
//        eventEntityDBO.setTitle("My title");
//        eventPublisher.publishEvent(eventEntityDBO);


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
