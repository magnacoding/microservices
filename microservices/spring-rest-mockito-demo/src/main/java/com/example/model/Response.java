package com.example.model;

/**
 * Created by irichiez on 4/16/17.
 */

public class Response {

    private int status;
    private String message;

    public Response() {
        super();
    }

    public Response(int status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
