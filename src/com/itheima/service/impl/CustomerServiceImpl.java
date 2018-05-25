package com.itheima.service.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

//    注解注入CustomerDao
    @Autowired
    private CustomerDao customerDao;

//    查询
    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
