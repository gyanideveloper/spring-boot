package com.gyanideveloper.springboot.hook.commond;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CommandRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CommandRunner.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info("Application started with CommandLineRunner::run(-) ::" + Arrays.toString(args));
	}

}