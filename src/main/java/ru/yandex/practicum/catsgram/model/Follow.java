package ru.yandex.practicum.catsgram.model;

import java.time.LocalDate;

public class Follow {
    private String author;
    private String follower;


    public Follow(String author, String follower) {
        this.author = author;
        this.follower = follower;
    }

    public String getAuthor() {
        return author;
    }

    public String getFollower() {
        return follower;
    }
    public void setFollower(String follower) {
        this.follower = follower;
    }
}
