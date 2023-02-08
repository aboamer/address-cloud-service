package com.cloud.addresscloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AddresscloudserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddresscloudserviceApplication.class, args);
	}

}
