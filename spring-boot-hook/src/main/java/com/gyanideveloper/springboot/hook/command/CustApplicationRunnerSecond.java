package com.gyanideveloper.springboot.hook.command;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class CustApplicationRunnerSecond implements ApplicationRunner,Ordered {

	private static final Logger logger = LoggerFactory.getLogger(CustApplicationRunnerSecond.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Application started with CustApplicationRunnerSecond::run(-) :: " + Arrays.toString(args.getSourceArgs()));
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
