package com.shsxt.crm.core.framework.constant;


import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取 获取系统上下文路径
 */
public class BaseController {

    /**
     * 获取上下文路径
     * 绑定至域对象
     *
     * @param request
     */

    @ModelAttribute
    public void preMethod(HttpServletRequest request){
        request.setAttribute("ctx", request.getContextPath());
    }
}

