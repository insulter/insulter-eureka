package com.insulter.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InsulterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsulterEurekaApplication.class, args);
	}
}
