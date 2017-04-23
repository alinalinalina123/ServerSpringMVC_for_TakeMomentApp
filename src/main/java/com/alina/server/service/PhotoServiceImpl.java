package com.alina.server.service;

import com.alina.server.entity.Photo;
import com.alina.server.entity.User;
import com.alina.server.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alina on 18.04.2017.
 */
@Service
public class PhotoServiceImpl implements PhotoService  {
    @Autowired
private PhotoRepository repository;
    @Transactional(readOnly=true)
    public List<Photo> getAll() {
        return repository.findAll();
    }

    public List<Photo> getByLoginList(String log) {  // Возвращает все фото данного пользователя по login
        List<Photo> PHr=repository.findAll();
        List<Photo> result_list = null;
        for (Photo item: PHr) {
            if(item.getOwnerName().equals(log)) { result_list.add(item);}
        }
        return result_list;
    }
    public Photo getByLoginAndName(String log,String Name) {   //возвращает одну  фотку по указаному имени файла и login
        List<Photo> ur=repository.findAll();
        for (Photo item: ur) {
            if(item.getOwnerName().equals(log) && item.getFilename().equals(Name)) return item;
        }
        return null;
    }


    public Photo save(Photo photo) {
        return repository.saveAndFlush(photo);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
