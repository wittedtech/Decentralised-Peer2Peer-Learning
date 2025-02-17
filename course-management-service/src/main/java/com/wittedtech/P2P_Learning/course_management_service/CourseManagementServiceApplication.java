package com.wittedtech.P2P_Learning.course_management_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourseManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseManagementServiceApplication.class, args);
	}

}
