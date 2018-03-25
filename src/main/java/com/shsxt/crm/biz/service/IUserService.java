package com.shsxt.crm.biz.service;

import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.core.common.util.Result;

import java.util.List;

public interface IUserService {

    Result queryServiceLogin(String userName, String userPwd);

    /**
     * 用户修改密码
     * @param userName
     * @param oldPassword
     * @param newPassword
     * @param confirmPassword
     * @return
     */
    Result userModifyPassword(String userName,String oldPassword,String newPassword,String confirmPassword);

    List<User> queryAllCustomerManager();

}

