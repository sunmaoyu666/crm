package com.shsxt.crm.biz.controller.user;

import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.biz.service.IUserService;
import com.shsxt.crm.core.common.util.Result;
import com.shsxt.crm.core.framework.context.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public Result userLogin(String userName,String userPwd){

        return userService.queryServiceLogin(userName,userPwd);
    }

    @RequestMapping("/modifyPassword")
    @ResponseBody
    public Result userModifyPassword(String userName,String oldPassword,String newPassword,String confirmPassword){

        return userService.userModifyPassword(userName,oldPassword,newPassword,confirmPassword );

    }

    @RequestMapping("/queryAllCustomerManager")
    @ResponseBody
    public List<User> queryAllCustomerManager(){
        return userService.queryAllCustomerManager();
    }
}

