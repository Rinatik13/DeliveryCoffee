package com.Coffee.Delivery.controller;

import com.Coffee.Delivery.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service service;
    @GetMapping("/test")
    public void startController(){
        System.out.println("start controller");
        service.startService();
    }
}
