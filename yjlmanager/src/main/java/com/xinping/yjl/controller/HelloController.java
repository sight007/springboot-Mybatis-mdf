package com.xinping.yjl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xinping.yjl.model.User;
import com.xinping.yjl.service.UserService;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private UserService userService;
	
    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "gaodeiMap";
    }
    
}
