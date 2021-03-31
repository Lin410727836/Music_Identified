package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Exception.UserConflictException;
import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;/*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;*/
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User createUser(User user) {
        Optional<User> existingUser = userRepository.findByUsername(user.getUsername());

        if(existingUser.isPresent()) {
            throw  new UserConflictException("This user has been created");
        }

     //   user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return  userRepository.save(user);
    }

    public User getUserByName(String username) {

        return  userRepository.findByUsername(username).orElseThrow
                (() -> new UserNotFoundException("Can't find the "+username));
    }

//    public User getUser() {
//
//    }

}
