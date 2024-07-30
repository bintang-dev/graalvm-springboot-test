package com.graalvm.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity(name = "article")
public class Article {

  @Id
  @GeneratedValue
  private UUID id;

  private String title;

  private String subTitle;

  @Column(name = "body", columnDefinition = "TEXT")
  private String body;
}
