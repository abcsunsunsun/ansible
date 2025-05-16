// src/main/java/com/example/newscrawler/domain/News.java

package com.example.newscrawler.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String newspaper;

    private String link;

    @Column(name = "pub_date")
    private String pubDate;

    private String content;

    @Column(name = "crolling_id")
    private Long crollingId;

    // Getter/Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getNewspaper() { return newspaper; }
    public void setNewspaper(String newspaper) { this.newspaper = newspaper; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }

    public String getPubDate() { return pubDate; }
    public void setPubDate(String pubDate) { this.pubDate = pubDate; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Long getCrollingId() { return crollingId; }
    public void setCrollingId(Long crollingId) { this.crollingId = crollingId; }
}
