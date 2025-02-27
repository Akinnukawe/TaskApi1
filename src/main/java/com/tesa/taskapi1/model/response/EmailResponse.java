package com.tesa.taskapi1.model.response;

public class EmailResponse {
    public String responseCode;
    public String responseMessage;

    public EmailResponse(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }
}
