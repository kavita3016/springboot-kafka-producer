package com.eim.springbootkafkaproducer.service;

import com.eim.springbootkafkaproducer.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {


    @Value("${topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Sales> kafkaTemplate;

    public void sendNotifications(List<Sales> salesList) {
        salesList.forEach(sale -> {
            kafkaTemplate.send(topicName, sale);

        });


    }

}
