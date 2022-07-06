package org.ait.project.onboardingtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OnboardingtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnboardingtaskApplication.class, args);
	}

}
