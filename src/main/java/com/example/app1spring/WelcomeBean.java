package com.example.app1spring;

public class WelcomeBean {
    private final String message;

    public WelcomeBean(String  message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
