package com.example.newscrawler.controller;

import com.example.newscrawler.service.KeywordService;
import com.example.newscrawler.domain.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class KeywordController {

    @Autowired
    private KeywordService keywordService;

    @GetMapping("/keywords")
    public String showKeywords(Model model) {
        List<Keyword> keywords = keywordService.getAllKeywords();
        model.addAttribute("keywords", keywords);
        return "keywords"; // templates/keywords.html
    }

    @PostMapping("/keywords")
    public String addKeyword(@RequestParam String keyword) {
        keywordService.saveKeyword(keyword);
        return "redirect:/keywords";
    }
}
