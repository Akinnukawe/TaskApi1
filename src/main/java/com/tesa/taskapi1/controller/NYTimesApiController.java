package com.tesa.taskapi1.controller;

import com.tesa.taskapi1.model.response.*;
import com.tesa.taskapi1.service.NYTimesApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NYTimesApiController {
    private final NYTimesApiService nyTimesApiService;

    @Autowired
    public NYTimesApiController(NYTimesApiService nyTimesApiService) {
        this.nyTimesApiService = nyTimesApiService;
    }

    @GetMapping("/ny-times-read-books")
    public ResponseEntity<ReadBookResponse> nyTimesReadBooks()
    {
        var bookResponse = nyTimesApiService.nyTimesReadBooks();
        return ResponseEntity.ok(bookResponse);
    }

    @GetMapping("/ny-times-best-sellers")
    public ResponseEntity<ReadBestSellerResponse> getBestSeller()
    {
        var bookResponse = nyTimesApiService.getBestSeller();
        return ResponseEntity.ok(bookResponse);
    }

    @GetMapping("/ny-times-full-overview")
    public ResponseEntity<ReadFullOverviewResponse> getFullOverview() {
        var response = nyTimesApiService.getFullOverview();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/ny-times-best-sellers-list-names")
    public ResponseEntity<ReadBestSellersListNamesResponse> getBestSellersListNames() {
        var response = nyTimesApiService.getBestSellersListNames();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/ny-times-best-sellers-list-by-date/{date}/{list}")
    public ResponseEntity<ReadBestSellersListByDateResponse> getBestSellersListByDate(@PathVariable String date, @PathVariable String list) {
        var response = nyTimesApiService.getBestSellersListByDate(date, list);
        return ResponseEntity.ok(response);
    }
}
