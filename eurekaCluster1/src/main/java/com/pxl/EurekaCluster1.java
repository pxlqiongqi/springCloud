package com.pxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaCluster1 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCluster1.class, args);
	}
}
