package com.tesa.taskapi1.repository.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tesa.taskapi1.model.request.ObjectPostRequest;
import com.tesa.taskapi1.model.response.*;
import okhttp3.*;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;

@Service
public class NYTimesApi {
    public ReadBookResponse nyTimesReadBooks()
    {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var defaultListValue = "hardcover-fiction";
        var apiKey = "BAYIxnaaWgIdKaAdwvTx4SCuNnwQ7tEw";
        var endpoint = "https://api.nytimes.com/svc/books/v3/lists.json";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();

        urlBuilder.addQueryParameter("api-key", apiKey);
        urlBuilder.addQueryParameter("list",defaultListValue);


        var builtUrl = urlBuilder.build();

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .build();

        try
        {
            var apiResponse = client.newCall(request).execute();
            if(apiResponse.isSuccessful())
            {
                String responseBody = apiResponse.body().string();
                var bookResponse = gson.fromJson(responseBody, BookResponse.class);

                return new ReadBookResponse("00","completed",bookResponse);
            }

            return new ReadBookResponse("106",apiResponse.message(),new BookResponse());
        }
        catch(Exception ex)
        {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadBookResponse("106",ex.getMessage(),new BookResponse());

        }
    }

    public ReadBestSellerResponse getBestSellers()
    {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var apiKey = "BAYIxnaaWgIdKaAdwvTx4SCuNnwQ7tEw";
        var endpoint = "https://api.nytimes.com/svc/books/v3/lists/best-sellers/history.json";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();

        urlBuilder.addQueryParameter("api-key", apiKey);


        var builtUrl = urlBuilder.build();

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .build();

        try
        {
            var apiResponse = client.newCall(request).execute();
            if(apiResponse.isSuccessful())
            {
                String responseBody = apiResponse.body().string();
                var bestSellerResponse = gson.fromJson(responseBody, BestSellerResponse.class);

                return new ReadBestSellerResponse("00","completed",bestSellerResponse);
            }

            return new ReadBestSellerResponse("106",apiResponse.message(),new BestSellerResponse());
        }
        catch(Exception ex)
        {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadBestSellerResponse("106",ex.getMessage(),new BestSellerResponse());

        }
    }

    public ReadBestSellersListNamesResponse nyTimesBestSellersListNames() {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var apiKey = "GgSLXffX5Qp5Gw5p6AbWdHNdRistdrWL";
        var endpoint = "https://api.nytimes.com/svc/books/v3/lists/names.json";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();

        urlBuilder.addQueryParameter("api-key", apiKey);


        var builtUrl = urlBuilder.build();

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .build();

        try {
            var apiResponse = client.newCall(request).execute();
            if (apiResponse.isSuccessful()) {
                String responseBody = apiResponse.body().string();
                var bestSellersListNamesResponse = gson.fromJson(responseBody, BestSellersListNamesResponse.class);

                return new ReadBestSellersListNamesResponse("00", "completed", bestSellersListNamesResponse);
            }

            return new ReadBestSellersListNamesResponse("106", apiResponse.message(), new BestSellersListNamesResponse());
        } catch (Exception ex) {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadBestSellersListNamesResponse("106", ex.getMessage(), new BestSellersListNamesResponse());

        }
    }

    public ReadFullOverviewResponse nyTimesFullOverview() {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var apiKey = "GgSLXffX5Qp5Gw5p6AbWdHNdRistdrWL";
        var endpoint = "https://api.nytimes.com/svc/books/v3/lists/full-overview.json";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();

        urlBuilder.addQueryParameter("api-key", apiKey);



        var builtUrl = urlBuilder.build();

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .build();

        try {
            var apiResponse = client.newCall(request).execute();
            if (apiResponse.isSuccessful()) {
                String responseBody = apiResponse.body().string();
                var fullOverviewResponse = gson.fromJson(responseBody, FullOverviewResponse.class);

                return new ReadFullOverviewResponse("00", "completed", fullOverviewResponse);
            }

            return new ReadFullOverviewResponse("106", apiResponse.message(), new FullOverviewResponse());
        } catch (Exception ex) {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadFullOverviewResponse("106", ex.getMessage(), new FullOverviewResponse());

        }
    }

    public ReadBestSellersListByDateResponse nyTimesBestSellersListByDate(String date, String list) {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var apiKey = "GgSLXffX5Qp5Gw5p6AbWdHNdRistdrWL";
        var endpoint = "https://api.nytimes.com/svc/books/v3/lists/" + date+ "/" + list + ".json";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();

        urlBuilder.addQueryParameter("api-key", apiKey);


        var builtUrl = urlBuilder.build();

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .build();

        try {
            var apiResponse = client.newCall(request).execute();
            if (apiResponse.isSuccessful()) {
                String responseBody = apiResponse.body().string();
                var bestSellersListByDateResponse = gson.fromJson(responseBody, BestSellersListByDateResponse.class);

                return new ReadBestSellersListByDateResponse("00", "completed", bestSellersListByDateResponse);
            }

            return new ReadBestSellersListByDateResponse("106", apiResponse.message(), new BestSellersListByDateResponse());
        } catch (Exception ex) {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadBestSellersListByDateResponse("106", ex.getMessage(), new BestSellersListByDateResponse());

        }
    }

    public ReadObjectPostResponse postObject(ObjectPostRequest createPostrequest)
    {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var endpoint = "https://api.restful-api.dev/objects";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();
        var builtUrl = urlBuilder.build();

        // Convert request class to JSON
        String jsonBody = gson.toJson(createPostrequest);

        // Create request body
        var body = RequestBody.create(
                jsonBody,
                MediaType.parse("application/json; charset=utf-8")
        );

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .post(body)
                .build();

        try
        {
            var apiResponse = client.newCall(request).execute();
            if(apiResponse.isSuccessful())
            {
                String responseBody = apiResponse.body().string();
                var apiCreatePostResponse = gson.fromJson(responseBody, ObjectPostResponse.class);

                return new ReadObjectPostResponse("00","completed",apiCreatePostResponse);
            }

            return new ReadObjectPostResponse("106",apiResponse.message(),new ObjectPostResponse());
        }
        catch(Exception ex)
        {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadObjectPostResponse("106",ex.getMessage(),new ObjectPostResponse());

        }
    }

    public ReadCountryListResponse getCountryList(String region, String country) {
        //step 1: initialise http client
        //get http client
        var client = new OkHttpClient();

        //for converting gson
        var gson = new Gson();

        //hard code list
        var endpoint = "http://universities.hipolabs.com/search";

        // Build URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(endpoint).newBuilder();

        urlBuilder.addQueryParameter("name", region);
        urlBuilder.addQueryParameter("country", country);


        var builtUrl = urlBuilder.build();

        // Create request
        var request = new Request.Builder()
                .url(builtUrl)
                .build();

        try {
            var apiResponse = client.newCall(request).execute();
            if (apiResponse.isSuccessful()) {
                String responseBody = apiResponse.body().string();

                Type listType = new TypeToken<ArrayList<CountryListResponse>>() {}.getType();
                ArrayList<CountryListResponse> countryListResponse = gson.fromJson(responseBody, listType);

                return new ReadCountryListResponse("00", "completed", countryListResponse);
            }

            return new ReadCountryListResponse("106", apiResponse.message(), new ArrayList<CountryListResponse>());
        } catch (Exception ex) {

            System.out.println(">> EXCEPTION ");
            System.out.println(ex.getMessage());

            return new ReadCountryListResponse("106", ex.getMessage(), new ArrayList<CountryListResponse>());

        }
    }
}
