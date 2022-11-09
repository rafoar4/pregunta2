package com.example.demo.dao;

import com.example.demo.entity.News;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class NewsDao {
    public List<News> list(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<News[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/news",News[].class
        );

        if (response.getStatusCode()== HttpStatus.OK){
            News[] newsList = response.getBody();
            return Arrays.asList(newsList);

        }else {
            return new ArrayList<>();
        }

    }
}
