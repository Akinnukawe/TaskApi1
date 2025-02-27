package com.tesa.taskapi1.model.response;

public class ReadObjectPostResponse {
    public String responseCode;
    public String responseMessage;
    public ObjectPostResponse data;

    public ReadObjectPostResponse(String responseCode, String responseMessage, ObjectPostResponse objectPostResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = objectPostResponse;
    }
}
