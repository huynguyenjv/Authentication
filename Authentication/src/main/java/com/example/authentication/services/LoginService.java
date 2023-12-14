package com.example.authentication.services;

import com.example.authentication.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final List<User> users ;

    public Boolean login(String usermane, String password){
        return true ;
    }

    public String getUserName(int id) {
        return users.get(id).getUsername();
    }

}
