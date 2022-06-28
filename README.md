# springboot-kafka-producer

This service reads the Json msgs from a file and publishes those msgs onto the kafka topic

## Description:
This is a spring boot application which publishes sale notification messages on the kafka topic.
- Endpoint : http://localhost:9090/publish/

## Technologies Used:
- Spring Boot 2.7.1
- Spring Kafka
- Core Java 1.8

## Installation

- Download Apache kafka if not already present from [here](https://archive.apache.org/dist/kafka/2.5.0/kafka_2.12-2.5.0.tgz) .
- Run Zookeeper : Command for windows bin\windows\zookeeper-server-start.bat config\zookeeper.properties (starts on port 2181 by default)
- Run Kafka Server : Command for windows bin\windows\kafka-server-start.bat config\server.properties (starts on port 9092 by default)
- Skip above two steps if zookeeper and kafka servers are already running
- Run the main class SpringbootKafkaProducerApplication.java
- load http://localhost:9090/publish/ on browser
- you will see "Message published Successfully!!" on the browser window if the msgs were loaded successfully
- refresh the browser if you want the send the set of sales notification msgs again to kafka topic.
