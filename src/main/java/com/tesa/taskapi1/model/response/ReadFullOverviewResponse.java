package com.tesa.taskapi1.model.response;

public class ReadFullOverviewResponse {
    public String responseCode;
    public String responseMessage;
    public FullOverviewResponse data;

    public ReadFullOverviewResponse(String responseCode, String responseMessage, FullOverviewResponse fullOverviewResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = fullOverviewResponse;
    }
}
