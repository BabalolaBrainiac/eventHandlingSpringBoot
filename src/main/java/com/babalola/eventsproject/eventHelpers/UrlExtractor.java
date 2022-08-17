package com.babalola.eventsproject.eventHelpers;
import com.google.gson.JsonObject;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


@Service
public class UrlExtractor {
    public void sendPostRequest(String webhookUrl, JsonObject payload) throws IOException {
            URL url = new URL(webhookUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = payload.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response);
            }
    }


//        ArrayList<NameValuePair> postParameters;
//        postParameters = new ArrayList<NameValuePair>();
//        postParameters.add(new BasicNameValuePair("eventTitle", "Testing POST request"));
//        postParameters.add(new BasicNameValuePair("eventPayload", payload));
//
//    DefaultHttpClient httpClient = new DefaultHttpClient();
//    HttpPost httpPost = new HttpPost(webhookUrl);
//    httpPost.setHeader("Content-type", "application/json");
//    httpPost.setHeader("Content-type", "application/json");
//    httpPost.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));
//    CloseableHttpResponse response = httpClient.execute(httpPost);
//
//    System.out.println(response.toString());
//    return response;
//    }


}
