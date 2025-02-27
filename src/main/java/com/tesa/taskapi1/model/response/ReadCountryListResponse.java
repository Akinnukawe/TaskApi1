package com.tesa.taskapi1.model.response;

import java.util.ArrayList;

public class ReadCountryListResponse {
    public String responseCode;
    public String responseMessage;
    public ArrayList<CountryListResponse> data;

    public ReadCountryListResponse(String responseCode, String responseMessage, ArrayList<CountryListResponse> countryListResponse)
    {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = countryListResponse;
    }
}
