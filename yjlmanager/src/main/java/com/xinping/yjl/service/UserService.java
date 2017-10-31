package com.xinping.yjl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinping.yjl.mapper.UserMapper;
import com.xinping.yjl.model.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        List<User> list = userMapper.list();
        return list;
    }

    public User getById(String id){
    	User user = userMapper.getById(id);
    	return user;
    }
}
