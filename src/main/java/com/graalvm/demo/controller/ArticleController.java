package com.graalvm.demo.controller;

import com.graalvm.demo.entity.Article;
import com.graalvm.demo.repository.ArticleRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/articles")
@RequiredArgsConstructor
public class ArticleController {

  private final ArticleRepository articleRepository;

  @GetMapping
  public ResponseEntity<List<Article>> getAll() {
    return ResponseEntity.ok(articleRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Article> findById(@PathVariable UUID id) {
    return ResponseEntity.ok(
        articleRepository.findById(id).orElseThrow(IllegalArgumentException::new));
  }


}
