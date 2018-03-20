package com.shsxt.crm.biz.controller;

import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.biz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("user/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") int id){

        return userService.queryServiceById(id);
    }
}
