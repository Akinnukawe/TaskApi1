package com.tesa.taskapi1.model.response;

import java.util.ArrayList;
import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
class BookDetail{
    public String title;
    public String description;
    public String contributor;
    public String author;
    public String contributor_note;
    public String price;
    public String age_group;
    public String publisher;
    public String primary_isbn13;
    public String primary_isbn10;
}



//class Result{
//    public String list_name;
//    public String display_name;
//    public String bestsellers_date;
//    public String published_date;
//    public int rank;
//    public int rank_last_week;
//    public int weeks_on_list;
//    public int asterisk;
//    public int dagger;
//    public String amazon_product_url;
//    public ArrayList<Isbn> isbns;
//    public ArrayList<BookDetail> book_details;
//    public ArrayList<Review> reviews;
//}



public class BookResponse{
    public String status;
    public String copyright;
    public int num_results;
    public Date last_modified;
    public ArrayList<Result> results;
}


