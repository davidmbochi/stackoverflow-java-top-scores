package com.javawhizz.questions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class QuestionsApplication {

	@Bean
	public ObjectMapper objectMapper(){
		return new ObjectMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(QuestionsApplication.class, args);
	}

}
