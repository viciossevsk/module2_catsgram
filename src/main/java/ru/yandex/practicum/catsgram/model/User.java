package ru.yandex.practicum.catsgram.model;

public class User {

    private String id;

    private String username;

    private String nickname;

    public User(String id, String username, String nickname) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
    }

    public User() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public String getId() {
        return id;
    }
}