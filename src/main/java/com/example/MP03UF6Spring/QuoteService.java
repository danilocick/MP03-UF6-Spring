package com.example.MP03UF6Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

    RestTemplate restTemplate = new RestTemplate();

    public String getQuote(){
        Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
        return quote.getValue().getQuote();
    }
}
