package com.stackroute.apigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApigatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayZuulApplication.class, args);
	}
}
