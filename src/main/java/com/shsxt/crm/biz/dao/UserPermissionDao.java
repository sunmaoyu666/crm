package com.shsxt.crm.biz.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPermissionDao {

   List<String> queryUserAclByUid(@Param("uid") Integer uid);
}
