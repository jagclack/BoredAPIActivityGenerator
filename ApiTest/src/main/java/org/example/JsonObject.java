package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JsonObject {

    public static Example getJson () {
        ObjectMapper objectMapper = new ObjectMapper();
        String baseUrl = "https://www.boredapi.com/api/activity";
        Example example = null;
        try {
            example = objectMapper.readValue(new URL(baseUrl), Example.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Activity: " + example.getActivity());
        System.out.println("Accessibility: " + example.getAccessibility());
        System.out.println("Type: " + example.getType());
        System.out.println("Participants: " + example.getParticipants());
        System.out.println("Price: " + example.getPrice());
        System.out.println("Link: " + example.getLink());
        System.out.println("Key: " + example.getKey());
        System.out.println("Message: " + example.getMessage());
        return example;
    }
}
