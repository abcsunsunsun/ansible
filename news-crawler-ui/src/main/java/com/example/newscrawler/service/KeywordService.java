package com.example.newscrawler.service;

import com.example.newscrawler.domain.Keyword;
import com.example.newscrawler.repository.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService {

    @Autowired
    private KeywordRepository keywordRepository;

    public Keyword saveKeyword(String keyword) {
        return keywordRepository.save(new Keyword(null, keyword, 0));
    }

    public List<Keyword> getAllKeywords() {
        return keywordRepository.findAll();
    }
}
