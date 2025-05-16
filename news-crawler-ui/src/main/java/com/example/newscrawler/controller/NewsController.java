package com.example.newscrawler.controller;

import com.example.newscrawler.domain.News;
import com.example.newscrawler.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    // URL: /news/{crollingId}
    @GetMapping("/news/{crollingId}")
    public String getNewsByCrollingId(@PathVariable Long crollingId, Model model) {
        List<News> newsList = newsService.getNewsByCrollingId(crollingId);
        model.addAttribute("newsList", newsList);
        return "news_list"; // templates/news_list.html
    }
}
