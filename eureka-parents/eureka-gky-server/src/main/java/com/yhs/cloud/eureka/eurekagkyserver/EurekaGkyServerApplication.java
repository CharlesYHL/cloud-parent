package com.yhs.cloud.eureka.eurekagkyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGkyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGkyServerApplication.class, args);
	}
}
