package com.shsxt.crm.biz.service.impl;

import com.shsxt.crm.biz.dao.UserPermissionDao;
import com.shsxt.crm.biz.service.IUserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户权限
 */
@Service
public class UserPermissionServiceImpl implements IUserPermissionService{
    @Autowired
    private UserPermissionDao userPermissionDao;

    @Override
    public List<String> queryUserAclByUid(Integer uid) {
        return userPermissionDao.queryUserAclByUid(uid);
    }
}
