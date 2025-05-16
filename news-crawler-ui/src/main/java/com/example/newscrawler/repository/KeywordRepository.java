package com.example.newscrawler.repository;

import com.example.newscrawler.domain.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
    Optional<Keyword> findByKeyword(String keyword);
}
