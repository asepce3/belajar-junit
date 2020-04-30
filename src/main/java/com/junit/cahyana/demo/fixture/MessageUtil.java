package com.junit.cahyana.demo.fixture;

public class MessageUtil {

    private String msg;

    public MessageUtil(String msg) {
        this.msg = msg;
    }

    public String printMessage() {
        return msg;
    }

    public String salutationMessage() {
        return "Hi!" + msg;
    }
}
