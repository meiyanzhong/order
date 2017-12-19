package com.topscore.omnichannel.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderPlaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPlaceApplication.class, args);
	}
}
