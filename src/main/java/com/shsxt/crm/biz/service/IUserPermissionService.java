package com.shsxt.crm.biz.service;

import java.util.List;

public interface IUserPermissionService {

    List<String> queryUserAclByUid(Integer uid);
}
