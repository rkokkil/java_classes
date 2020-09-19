package com.example;

import com.example.model.Greeting;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootFirstWebConsumerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebConsumerProjectApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting?name=Ram", Greeting.class);
			System.out.println(greeting);
		};
	}

}
