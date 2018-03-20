package com.shsxt.crm.biz.service;

import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.core.common.util.Result;

public interface IUserService {

    Result queryServiceLogin(String userName, String userPwd);
}

