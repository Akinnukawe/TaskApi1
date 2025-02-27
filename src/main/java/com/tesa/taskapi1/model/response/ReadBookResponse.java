package com.tesa.taskapi1.model.response;

public class ReadBookResponse
{
    public String responseCode;
    public String responseMessage;
    public BookResponse data;

    public ReadBookResponse(String responseCode, String responseMessage, BookResponse bookResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = bookResponse;
    }
}