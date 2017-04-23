package com.alina.server.repository;

import com.alina.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alina on 26.03.2017.
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
