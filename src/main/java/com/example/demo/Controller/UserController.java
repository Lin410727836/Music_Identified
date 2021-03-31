package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/registration")
    public ResponseEntity<User> createUser(User user) {

        User newUser = userService.createUser(user);

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public String getUser() {

        return "get user";
    }
    @PostMapping("/login")
    public ResponseEntity<User> login(User user) {
        User databseUser = userService.getUserByName(user.getUsername());
        if(user.getPassword().equals(databseUser.getPassword())) {
            return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
        } else  {
            throw new UserNotFoundException("Can't find the "+user.getUsername());
        }

    }
}
