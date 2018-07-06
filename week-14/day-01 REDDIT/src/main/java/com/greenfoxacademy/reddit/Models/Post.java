package com.greenfoxacademy.reddit.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String url;
    Instant timestamp;
    Instant lastUpdated;
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

    public Instant readTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Long getLastUpdated() {
        if (lastUpdated == null) {
            return null;
        } else {
            return lastUpdated.getEpochSecond();
        }
    }

    public void setLastUpdated() {
        this.lastUpdated = Instant.now();
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
