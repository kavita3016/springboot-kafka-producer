# springboot-kafka-producer

This service reads the Json msgs from a file and publishes those msgs onto the kafka topic

Local Setup Steps:

 - First install Apache kafka
 - start the zookeeper process
 - start the kafka server
 - Import this project into your ide and do a maven build.
 - run the main class SpringbootKafkaProducerApplication.java
 - load http://localhost:9090/publish/ on browser
 - you will see "Message published Successfully!!" on the browser window if the msgs were loaded successfully
 - refresh the browser if you want the send the set of msgs again to kafka topic.
