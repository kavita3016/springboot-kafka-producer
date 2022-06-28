package com.assessment.sales.processing.controller;

import com.assessment.sales.processing.service.ReaderService;
import com.assessment.sales.processing.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {


    @Autowired
    SalesService salesService;

    @Autowired
    ReaderService readerService;

    @GetMapping("/publish")
    public String publishMessage(){
        salesService.sendNotifications(readerService.publishSales());
        System.out.println(readerService.publishSales());
        return "Message published Successfully!!";
    }


}
