package com.example.newscrawler.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "keyword")
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyword;

    @Column(name = "subscribe_count")
    private int subscribeCount;

    // 기본 생성자 (JPA 필수!)
    public Keyword() {}

    // 전체 필드 생성자
    public Keyword(Long id, String keyword, int subscribeCount) {
        this.id = id;
        this.keyword = keyword;
        this.subscribeCount = subscribeCount;
    }

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) { this.keyword = keyword; }

    public int getSubscribeCount() { return subscribeCount; }
    public void setSubscribeCount(int subscribeCount) { this.subscribeCount = subscribeCount; }
}
