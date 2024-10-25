package com.wittedtech.P2P_Learning.logging_and_monitoring_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoggingAndMonitoringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAndMonitoringServiceApplication.class, args);
	}

}
