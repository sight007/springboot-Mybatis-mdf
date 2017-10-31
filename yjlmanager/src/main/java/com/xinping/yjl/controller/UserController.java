package com.xinping.yjl.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinping.yjl.model.User;
import com.xinping.yjl.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model){
    	List<User> users = userService.getUserInfo();
    	model.addAttribute("users", users);
    	return "hello";
    }
    
}
