package com.automation.listener;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

/**
 * Hello world!
 *
 */
public class App {
	static Logger logger = LogManager.getLogger(App.class.getName());
	@Test
	public static void log(){
		System.out.println("System.out.println");
		logger.info("This is Info");
	}
}
