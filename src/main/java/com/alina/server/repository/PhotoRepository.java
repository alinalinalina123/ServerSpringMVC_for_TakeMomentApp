package com.alina.server.repository;

import com.alina.server.entity.Photo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alina on 18.04.2017.
 */
public interface PhotoRepository extends JpaRepository<Photo,Long> {

}
