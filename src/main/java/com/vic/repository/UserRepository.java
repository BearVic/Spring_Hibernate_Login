package com.vic.repository;

import com.vic.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by victor on 24/06/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {


    @Query(value = "select * from user u where u.username=?1",nativeQuery = true)
    UserEntity findByUsername(String username);
}
