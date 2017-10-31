package com.xinping.yjl.mapper;

import java.util.List;

import com.xinping.yjl.model.User;

public interface UserMapper {
	
    public List<User> list();
    
    public User getById(String id);
    
}
