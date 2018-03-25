package com.shsxt.crm.biz.service.impl;

import com.shsxt.crm.biz.dao.CustomerDao;
import com.shsxt.crm.biz.model.Customer;
import com.shsxt.crm.biz.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> queryAllCustomers() {
        return customerDao.queryAllCustomers();
    }
}
