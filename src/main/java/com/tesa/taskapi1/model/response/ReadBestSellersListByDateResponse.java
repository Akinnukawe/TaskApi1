package com.tesa.taskapi1.model.response;

public class ReadBestSellersListByDateResponse {
    public String responseCode;
    public String responseMessage;
    public BestSellersListByDateResponse data;

    public ReadBestSellersListByDateResponse(String responseCode, String responseMessage, BestSellersListByDateResponse bestSellersListByDateResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = bestSellersListByDateResponse;
    }
}
