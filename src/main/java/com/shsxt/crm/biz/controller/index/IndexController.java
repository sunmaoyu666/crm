package com.shsxt.crm.biz.controller.index;

import com.shsxt.crm.core.framework.constant.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 登录页面跳转
 */
@Controller
public class IndexController extends BaseController{

    @GetMapping("index")
    public String index(){

        return "index";
    }

}
