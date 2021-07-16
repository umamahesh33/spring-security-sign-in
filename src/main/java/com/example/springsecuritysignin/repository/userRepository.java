package com.example.springsecuritysignin.repository;

import com.example.springsecuritysignin.model.myUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<myUser, Integer>{

    myUser findByUsername(String username);

}
