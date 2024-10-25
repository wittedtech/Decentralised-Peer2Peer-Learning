package com.wittedtech.P2P_Learning.mentorship_booking_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MentorshipBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorshipBookingServiceApplication.class, args);
	}

}
