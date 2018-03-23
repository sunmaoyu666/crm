package com.shsxt.crm.biz.controller.main;

import com.shsxt.crm.biz.service.IMainIndexService;
import com.shsxt.crm.core.framework.context.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/main")
public class MainIndexController extends BaseController{

    @Autowired
    private IMainIndexService mainIndexService;

    @GetMapping("index")
    public String index(HttpServletRequest req){

        return mainIndexService.MainIndexCheck(req);
    }
}
