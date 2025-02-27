package com.tesa.taskapi1.model.response;

import java.util.ArrayList;

public class FullOverviewResponse {
    public String status;
    public String copyright;
    public int num_results;
    public Results results;
}

class Book{
    public String age_group;
    public String amazon_product_url;
    public String article_chapter_link;
    public String author;
    public String book_image;
    public int book_image_width;
    public int book_image_height;
    public String book_review_link;
    public String book_uri;
    public String btrn;
    public String contributor;
    public String contributor_note;
    public String created_date;
    public String description;
    public String first_chapter_link;
    public String price;
    public String primary_isbn10;
    public String primary_isbn13;
    public String publisher;
    public int rank;
    public int rank_last_week;
    public String sunday_review_link;
    public String title;
    public String updated_date;
    public int weeks_on_list;
    public ArrayList<BuyLink> buy_links;
}

class BuyLink{
    public String name;
    public String url;
}

class List{
    public int list_id;
    public String list_name;
    public String list_name_encoded;
    public String display_name;
    public String updated;
    public Object list_image;
    public Object list_image_width;
    public Object list_image_height;
    public ArrayList<Book> books;
}

class Results{
    public String bestsellers_date;
    public String published_date;
    public String published_date_description;
    public String previous_published_date;
    public String next_published_date;
    public ArrayList<List> lists;
}
