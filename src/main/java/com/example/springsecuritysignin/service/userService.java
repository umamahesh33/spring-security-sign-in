package com.example.springsecuritysignin.service;

import com.example.springsecuritysignin.model.myUser;
import com.example.springsecuritysignin.repository.userRepository;
import com.example.springsecuritysignin.requestPOJO.userRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;


@Service
public class userService implements UserDetailsService{

    @Autowired
    userRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        myUser myUser=userRepository.findByUsername(s);
        return new User(myUser.getUsername(),myUser.getPassword(),Arrays.asList(new SimpleGrantedAuthority("std")));
    }

    public void createUser(userRequest userRequest) {
            String encodePassword = passwordEncoder.encode(userRequest.getPassword());
            myUser saveUser=new myUser();
            saveUser.setUsername(userRequest.getUsername());
            saveUser.setPassword(encodePassword);
            userRepository.save(saveUser);
    }
}
