package com.yhs.cloud.eureks.eurekagkyserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGkyServerOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGkyServerOneApplication.class, args);
	}
}
