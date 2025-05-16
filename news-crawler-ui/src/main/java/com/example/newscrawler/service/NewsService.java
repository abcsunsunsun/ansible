package com.example.newscrawler.service;

import com.example.newscrawler.domain.News;
import com.example.newscrawler.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    // crollingId로 뉴스 목록 조회
    public List<News> getNewsByCrollingId(Long crollingId) {
        return newsRepository.findByCrollingId(crollingId);
    }
}
