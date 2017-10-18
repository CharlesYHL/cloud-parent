package com.yhs.cloud.eureka.servergkyhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerGkyHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerGkyHiApplication.class, args);
	}
}
