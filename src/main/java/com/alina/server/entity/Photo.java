package com.alina.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by alina on 14.04.2017.
 */
@Entity
@Table(name = "photo_table")
public class Photo {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "filename_", nullable = false)
    private String filename;
    @Column(name = "like_col_", nullable = false)
    private int like_col;
    @Column(name = "owner_name_", nullable = false)
    private String owner_name;
    @Column(name = "path_", nullable = false)
    private String path;

    public Photo()
    {}
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }
    public void setFilename(String file_) {
        this.filename = file_;
    }

    public int getLikeCol() {
        return like_col;
    }
    public void setLikeCol(int likeCol) {
        this.like_col = likeCol;
    }

    public String getOwnerName() {
        return owner_name;
    }
    public void setOwnerName(String owner_) {
        this.owner_name = owner_;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path_) {
        this.path = path_;
    }

}
