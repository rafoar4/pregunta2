package com.example.demo.dao;

import com.example.demo.entity.Coin;
import com.example.demo.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.News;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class CoinDao {



    public List<Coin> list(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<News[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/coins/bitcoin?currency=AMD",News[].class
        );
        return (List<Coin>) response;
    }
}
