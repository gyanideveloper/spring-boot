package com.gyanideveloper.springboot.hook.commond;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class CommandRunnerSecound implements CommandLineRunner, Ordered {

	private static final Logger logger = LoggerFactory.getLogger(CommandRunnerSecound.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info("Application started with CommandRunnerSecound::run(-) ::" + Arrays.toString(args));
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
