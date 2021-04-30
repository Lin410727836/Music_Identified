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

//controller,做User有關的邏輯動作
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService userService;
    //註冊API
    @PostMapping(value = "/registration")
    public ResponseEntity<User> createUser(User user) {

        User newUser = userService.createUser(user);

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    //目前不需要用，請無視此API
    @GetMapping("/get")
    public String getUser() {

        return "get user";
    }
    //登入API
    // 利用API傳過來的帳號資料，比對資料庫有無此帳號，有則回傳使用者資料，無則拋UserNotFoundException例外
    @PostMapping("/login")
    public ResponseEntity<User> login(User user) {

        User databseUser = userService.getUserByName(user.getUsername());
        if(user.getPassword().equals(databseUser.getPassword())) {
            return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
        } else  {
            throw new UserNotFoundException("Can't find "+user.getUsername());
        }

    }
}
