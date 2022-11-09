package com.example.demo.dao;

import com.example.demo.entity.News;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class NewsDao {
    public List<News> list(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<News[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/news/handpicked?skip=0&limit=5",News[].class
        );
        return Arrays.asList(response.getBody());
    }
}
