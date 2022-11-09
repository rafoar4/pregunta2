package com.example.demo.controller;

import com.example.demo.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/news")
public class NewsController {
    @Autowired
    NewsDao newsDao;
    @GetMapping({"/list", "", "/"})
    public String list(Model model){
        model.addAttribute("list",newsDao.list());
        return "news/list";
    }

}
