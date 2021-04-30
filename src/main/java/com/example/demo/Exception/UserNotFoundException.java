package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

//當打錯帳號找不到此使用者的exeception
public class UserNotFoundException extends ResponseStatusException {

    public UserNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND,message);
    }
}
