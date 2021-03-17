package com.security.spring.services;


import com.security.spring.model.User;


import java.util.List;


public interface ApiService {


    List<User> getUsers(Integer limit);

}
