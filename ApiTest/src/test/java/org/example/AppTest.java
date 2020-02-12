package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.io.IOException;
import java.net.URL;

public class AppTest {

    @BeforeAll
    public static void doThis() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = new URL("https://www.boredapi.com/api/activity");
        objectMapper.readValue(url, Example.class);
    }

    @Test
    public void activityShouldBeAString() {
        Assertions.assertEquals(String.class, Example.getActivity().getClass());
    }

    @Test
    public void accessibilityShouldBeADouble() {
        //Assertions.assertEquals();
    }

    @Test
    public void typeShouldBeAString() {
        Assertions.assertEquals(String.class, Example.getType().getClass());
    }

    @Test
    public void participantsShouldBeAnInteger() {
        //Assertions.assertEquals();
    }

    @Test
    public void priceShouldBeADouble() {

    }

    @Test
    public void linkShouldBeAString() {
        Assertions.assertEquals(String.class, Example.getLink().getClass());
    }

    @Test
    public void keyShouldBeAString() {
        Assertions.assertEquals(String.class, Example.getKey().getClass());
    }
}

