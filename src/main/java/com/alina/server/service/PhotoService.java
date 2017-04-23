package com.alina.server.service;

import com.alina.server.entity.Photo;
import com.alina.server.entity.User;

import java.util.List;

/**
 * Created by alina on 18.04.2017.
 */
public interface PhotoService {
    List<Photo> getAll();
    List<Photo> getByLoginList(String log);
    Photo getByLoginAndName(String log,String name);
    Photo save(Photo photo);
    void remove(long id);
}
