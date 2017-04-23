package com.alina.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by alina on 20.04.2017.
 */
@Entity
@Table(name = "like_table")
public class Like {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "Source_user_", nullable = false)
    private String source_user;
    @Column(name = "Destination_user", nullable = false)
    private String destination_user;
    @Column(name = "photo_id_", nullable = false)
    private int photo_id;

    Like()
    {

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getSource_user() {
        return source_user;
    }

    public void setSource_user(String source_user) {
        this.source_user = source_user;
    }

    public String getDestination_user() {
        return destination_user;
    }

    public void setDestination_user(String destination_user) {
        this.destination_user = destination_user;
    }

    public int getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(int photo_id) {
        this.photo_id = photo_id;
    }
}
