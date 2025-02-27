package com.tesa.taskapi1.model.response;

public class ReadBestSellersListNamesResponse {
    public String responseCode;
    public String responseMessage;
    public BestSellersListNamesResponse data;

    public ReadBestSellersListNamesResponse(String responseCode, String responseMessage, BestSellersListNamesResponse bestSellersListNamesResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = bestSellersListNamesResponse;
    }
}
