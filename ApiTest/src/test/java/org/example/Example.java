package org.example;

public class Example {
    private static String activity;
    private static double accessibility;
    private static String type;
    private static int participants;
    private static double price;
    private static String link;
    private static String key;
    private static String message;

    public Example() {
    }

    public Example(String activity, double accessibility, String type, int participants, double price, String link, String key, String message) {
        this.activity = activity;
        this.accessibility = accessibility;
        this.type = type;
        this.participants = participants;
        this.price = price;
        this.link = link;
        this.key = key;
        this.message = message;
    }

    public static String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public double getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(double accessibility) {
        this.accessibility = accessibility;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
