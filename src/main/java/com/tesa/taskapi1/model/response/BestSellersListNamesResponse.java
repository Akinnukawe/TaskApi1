package com.tesa.taskapi1.model.response;

import java.util.ArrayList;

public class BestSellersListNamesResponse {
    public String status;
    public String copyright;
    public int num_results;
    public ArrayList<Result3> results;
}

class Result3{
    public String list_name;
    public String display_name;
    public String list_name_encoded;
    public String oldest_published_date;
    public String newest_published_date;
    public String updated;
}
