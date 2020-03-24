package com.example.greeting;

public class Greeting {

    private final int value;
    private final String responseBody;

    public Greeting(int value, String responseBody) {

        this.value = value;
        this.responseBody = responseBody;
    }

    public long getValue() {
        return value;
    }

    public String getResponseBody() {
        return responseBody;
    }
}
