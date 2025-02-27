package com.tesa.taskapi1.model.response;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

import java.util.ArrayList;

class Isbn{
    public String isbn10;
    public String isbn13;
}

class RanksHistory{
    public String primary_isbn10;
    public String primary_isbn13;
    public int rank;
    public String list_name;
    public String display_name;
    public String published_date;
    public String bestsellers_date;
    public int weeks_on_list;
    public int rank_last_week;
    public int asterisk;
    public int dagger;
}

class Review{
    public String book_review_link;
    public String first_chapter_link;
    public String sunday_review_link;
    public String article_chapter_link;
}

class Result{
    public String title;
    public String description;
    public String contributor;
    public String author;
    public String contributor_note;
    public String price;
    public String age_group;
    public String publisher;
    public ArrayList<Isbn> isbns;
    public ArrayList<RanksHistory> ranks_history;
    public ArrayList<Review> reviews;
}


public class BestSellerResponse{
    public String status;
    public String copyright;
    public int num_results;
    public ArrayList<Result> results;
}


