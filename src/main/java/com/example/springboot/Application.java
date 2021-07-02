package com.example.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return  args -> {
			System.out.println("Lets inspect the beans provided by sprignboot");
			String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
			Arrays.stream(beanDefinitionNames).sorted().forEach(System.out::println);
		};
	}

}
