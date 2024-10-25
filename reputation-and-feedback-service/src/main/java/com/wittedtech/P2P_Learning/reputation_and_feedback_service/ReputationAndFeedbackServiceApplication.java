package com.wittedtech.P2P_Learning.reputation_and_feedback_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReputationAndFeedbackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReputationAndFeedbackServiceApplication.class, args);
	}

}
