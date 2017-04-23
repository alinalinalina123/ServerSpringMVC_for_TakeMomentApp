package com.alina.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by alina on 26.03.2017.
 */
@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "login_", nullable = false, length = 50)
    private String login;
    @Column(name = "password_", nullable = false, length = 50)
    private String password;


    @Column(name = "name_", nullable = false, length = 50)
    private String name;
    @Column(name = "email_", nullable = false, length = 50)
    private String email;
    @Column(name = "posts_" )
    private int posts;
    @Column(name = "followers_")
    private int followers;
    @Column(name = "following_")
    private int following;
    public User() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getPosts() {
        return posts;
    }
    public void setPosts(int post) {
        this.posts = post;
    }

    public int getFollowers() {
        return followers;
    }
    public void setFollowers(int follower) {
        this.followers = follower;
    }

    public int getFollowing() {
        return posts;
    }
    public void setFollowing(int following) {
        this.following = following;
    }
}
