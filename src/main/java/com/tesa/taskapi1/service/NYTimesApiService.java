package com.tesa.taskapi1.service;

import com.tesa.taskapi1.model.request.ObjectPostRequest;
import com.tesa.taskapi1.model.response.*;
import com.tesa.taskapi1.repository.api.NYTimesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NYTimesApiService {
    private final NYTimesApi nyTimesApi;
    
    @Autowired
    public NYTimesApiService(NYTimesApi nyTimesApi) {
        this.nyTimesApi = nyTimesApi;
    }

    public ReadBookResponse nyTimesReadBooks(){
        return nyTimesApi.nyTimesReadBooks();
    }

    public ReadBestSellerResponse getBestSeller(){
        return nyTimesApi.getBestSellers();
    }

    public ReadFullOverviewResponse getFullOverview(){
        return nyTimesApi.nyTimesFullOverview();
    }

    public ReadBestSellersListNamesResponse getBestSellersListNames(){
        return nyTimesApi.nyTimesBestSellersListNames();
    }

    public ReadBestSellersListByDateResponse getBestSellersListByDate(String date, String list){
        return nyTimesApi.nyTimesBestSellersListByDate(date, list);
    }

    public ReadObjectPostResponse postObject(ObjectPostRequest object){
        return nyTimesApi.postObject(object);
    }

    public ReadCountryListResponse getCountryList(String region, String country){
        return nyTimesApi.getCountryList(region, country);
    }
}
