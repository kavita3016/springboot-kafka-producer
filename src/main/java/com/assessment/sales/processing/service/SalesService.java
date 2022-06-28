package com.assessment.sales.processing.service;

import com.assessment.sales.processing.model.SalesNotificationMessage;
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
    private KafkaTemplate<String, SalesNotificationMessage> kafkaTemplate;

    public void sendNotifications(List<SalesNotificationMessage> salesList) {
        salesList.forEach(sale -> {
            kafkaTemplate.send(topicName, sale);

        });


    }

}
