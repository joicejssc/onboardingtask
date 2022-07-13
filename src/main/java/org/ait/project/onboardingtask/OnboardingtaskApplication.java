package org.ait.project.onboardingtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableFeignClients
@SpringBootApplication
public class OnboardingtaskApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(OnboardingtaskApplication.class, args);

	}

}
