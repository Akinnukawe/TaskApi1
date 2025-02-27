package com.tesa.taskapi1.model.response;

import java.util.ArrayList;
import java.util.Date;

public class BestSellersListByDateResponse {
    public String status;
    public String copyright;
    public int num_results;
    public Date last_modified;
    public Results5 results;
}

class Book5{
    public int rank;
    public int rank_last_week;
    public int weeks_on_list;
    public int asterisk;
    public int dagger;
    public String primary_isbn10;
    public String primary_isbn13;
    public String publisher;
    public String description;
    public String price;
    public String title;
    public String author;
    public String contributor;
    public String contributor_note;
    public String book_image;
    public int book_image_width;
    public int book_image_height;
    public String amazon_product_url;
    public String age_group;
    public String book_review_link;
    public String first_chapter_link;
    public String sunday_review_link;
    public String article_chapter_link;
    public ArrayList<Isbn5> isbns;
    public ArrayList<BuyLink5> buy_links;
    public String book_uri;
}

class BuyLink5{
    public String name;
    public String url;
}

class Isbn5{
    public String isbn10;
    public String isbn13;
}

class Results5{
    public String list_name;
    public String list_name_encoded;
    public String bestsellers_date;
    public String published_date;
    public String published_date_description;
    public String next_published_date;
    public String previous_published_date;
    public String display_name;
    public int normal_list_ends_at;
    public String updated;
    public ArrayList<Book5> books;
    public ArrayList<Object> corrections;
}