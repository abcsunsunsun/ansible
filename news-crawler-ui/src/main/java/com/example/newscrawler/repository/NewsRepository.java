package com.example.newscrawler.repository;

import com.example.newscrawler.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    // news 테이블의 keyword_id(혹은 crolling_id) 기준으로 뉴스 조회
    List<News> findByCrollingId(Long crollingId);

    // 만약 news 테이블에 keyword_id가 있다면, 아래처럼 사용 가능
    // List<News> findByKeywordId(Long keywordId);
}
