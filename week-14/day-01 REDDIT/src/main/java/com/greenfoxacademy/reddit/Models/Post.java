package com.greenfoxacademy.reddit.Models;

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class Post {

    @Id
    @GeneratedValue
    Long id;
    String title;
    String url;
    Instant timestamp;
    Integer score;
    String owner;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getTimestamp() {
        return timestamp.getEpochSecond();
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void incrementScore() {
        score++;
    }

    public void decrementScore() {
        score--;
    }

    Post() {
        this.timestamp = Instant.now();
        this.score = 0;
    }

    public Post(String title, String url, Integer score, String owner) {
        this();
        this.title = title;
        this.url = url;
        this.score = score;
        this.owner = owner;
    }
}
