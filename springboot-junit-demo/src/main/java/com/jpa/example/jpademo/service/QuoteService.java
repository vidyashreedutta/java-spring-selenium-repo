package com.jpa.example.jpademo.service;

import com.jpa.example.jpademo.dto.rest.Quote;
import com.sun.org.apache.xpath.internal.operations.Quo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class QuoteService {


    public String getAQuote() {

        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "https://quoters.apps.pcfone.io/api/random";
//        Quote responseEntity = restTemplate.getForObject(baseUrl, Quote.class);

       ResponseEntity<Quote> responseEntity = restTemplate.getForEntity(baseUrl, Quote.class);
       Quote quote = responseEntity.getBody();
       return quote.getValue().getQuote();
    }
}
