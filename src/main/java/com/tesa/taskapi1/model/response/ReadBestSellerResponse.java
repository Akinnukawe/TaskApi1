package com.tesa.taskapi1.model.response;

public class ReadBestSellerResponse{
    public String responseCode;
    public String responseMessage;
    public BestSellerResponse data;

    public ReadBestSellerResponse(String responseCode, String responseMessage, BestSellerResponse bookResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = bookResponse;
    }
}
