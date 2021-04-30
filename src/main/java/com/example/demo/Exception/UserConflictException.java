package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//註冊時已有此使用者的exception
@ResponseStatus(HttpStatus.CONFLICT)
public class UserConflictException extends RuntimeException{

    public UserConflictException(String message) {
        super(message);
    }
}
