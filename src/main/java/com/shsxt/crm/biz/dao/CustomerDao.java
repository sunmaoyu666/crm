package com.shsxt.crm.biz.dao;

import com.shsxt.crm.biz.model.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> queryAllCustomers();
}
