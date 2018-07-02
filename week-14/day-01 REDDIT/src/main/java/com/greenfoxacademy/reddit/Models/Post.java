package com.greenfoxacademy.reddit.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    Long id;
    String title;
    String url;
    Long timestamp;
    Integer score;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public Post(String title, String url, Long timestamp, Integer score) {
        this.title = title;
        this.url = url;
        this.timestamp = timestamp;
        this.score = score;
    }
}
