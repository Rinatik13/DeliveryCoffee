package com.Coffee.Delivery.service;

import com.Coffee.Delivery.DAO.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Autowired
    DAO dao;
    @Override
    @Transactional
    public void startService() {
        System.out.println("start service");
        dao.addNewConsumer();
    }
}
