package com.gyanideveloper.springboot.hook;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHookApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootHookApplication.class);

	@Bean
	public CommandLineRunner getRunner() {
		return args -> {
			logger.info("Application started with @Bean CommandLineRunner::run(-) ::" + Arrays.toString(args));
		};
	}

	@Bean
	public ApplicationRunner getApplicationRunner() {
		return args -> {
			logger.info("Application started with @Bean ApplicationRunner::run(-) ::"
					+ Arrays.toString(args.getSourceArgs()));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHookApplication.class, args);
	}

}
