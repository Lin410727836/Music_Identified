package com.example.demo.Service;
/*
import com.example.demo.Entity.MyUserDetails;
import com.example.demo.Entity.User;
import com.example.demo.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByName(username);
        if(user == null)
            throw new UserNotFoundException("Can't find the "+username);

        return new MyUserDetails(user);
    }

}*/
