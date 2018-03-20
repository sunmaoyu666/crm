package com.shsxt.crm.biz.controller;

import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.biz.service.IUserService;
import com.shsxt.crm.core.common.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public Result userLogin(String userName,String userPwd){

        return userService.queryServiceLogin(userName,userPwd);
    }
}

