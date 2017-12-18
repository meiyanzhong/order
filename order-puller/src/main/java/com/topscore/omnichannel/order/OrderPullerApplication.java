package com.topscore.omnichannel.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@MapperScan("com.topscore.omnichannel.order")
@EnableEurekaClient
@SpringBootApplication
public class OrderPullerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPullerApplication.class, args);
	}
}
