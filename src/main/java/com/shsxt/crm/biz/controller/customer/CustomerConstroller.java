package com.shsxt.crm.biz.controller.customer;

import com.shsxt.crm.biz.model.Customer;
import com.shsxt.crm.biz.service.ICustomerService;
import com.shsxt.crm.core.framework.context.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerConstroller extends BaseController{

    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/queryAllCustomers")
    @ResponseBody
    public List<Customer> queryAllCustomers(){

        return customerService.queryAllCustomers();
    }
}
