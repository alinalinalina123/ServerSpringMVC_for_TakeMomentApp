package com.alina.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by alina on 20.04.2017.
 */
@Entity
@Table(name = "follow_table")
public class Follow {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "Source_user_follow_", nullable = false)
    private String source_user_follow;
    @Column(name = "Destination_user_follow", nullable = false)
    private String destination_user_follow;

    Follow()
    {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSource_user_follow() {
        return source_user_follow;
    }

    public void setSource_user_follow(String source_user_follow) {
        this.source_user_follow = source_user_follow;
    }

    public String getDestination_user_follow() {
        return destination_user_follow;
    }

    public void setDestination_user_follow(String destination_user_follow) {
        this.destination_user_follow = destination_user_follow;
    }
}
