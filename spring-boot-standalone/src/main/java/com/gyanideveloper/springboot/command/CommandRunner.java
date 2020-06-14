package com.gyanideveloper.springboot.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gyanideveloper.springboot.service.HelloService;

@Component
public class CommandRunner implements CommandLineRunner {

	@Autowired
	private HelloService helloService;

	private static final Logger logger = LoggerFactory.getLogger(CommandRunner.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info(helloService.sayHello("Gyani Developer"));
	}

}