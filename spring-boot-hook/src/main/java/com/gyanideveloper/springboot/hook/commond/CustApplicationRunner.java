package com.gyanideveloper.springboot.hook.commond;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CustApplicationRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(CustApplicationRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Application started with CustApplicationRunner::run(-)");
		logger.info("Row Arguments :: " + Arrays.toString(args.getSourceArgs()));
		logger.info("getOptionNames() :: " + args.getOptionNames());
		logger.info("containsOption(-) :: " + args.containsOption("server.port"));
		logger.info("getOptionValues(-) :: " + args.getOptionValues("server.port"));
		logger.info("getNonOptionArgs() :: " + args.getNonOptionArgs());

	}

}
