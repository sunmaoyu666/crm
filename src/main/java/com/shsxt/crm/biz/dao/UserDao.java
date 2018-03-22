package com.shsxt.crm.biz.dao;

import com.shsxt.crm.biz.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User queryUserByUserName(@Param("userName") String userName);

    int updateUserPwdByUserName(User user);
}
