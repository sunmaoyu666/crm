package com.shsxt.crm.core.common.util;

import com.shsxt.crm.biz.model.User;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 用户登录
 */
public class VerificationLoginUtil {

    private static final String SESSION_ID = "session_id";

    /**
     * 实现用户登录
     * @param session
     * @param resp
     * @param user
     */
    public static void userLoginTools(HttpSession session, HttpServletResponse resp, User user){

        //令牌
        String authCustomerCode = GeneratePrimaryKeyStrategy.authCustomerCode();

        //在session中存值
        session.setAttribute(authCustomerCode,user);

        //返回令牌
        CookieUtil.addCookie(resp,SESSION_ID,authCustomerCode,30*60);

    }
}
