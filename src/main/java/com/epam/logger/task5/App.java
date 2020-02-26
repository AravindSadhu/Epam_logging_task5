package com.epam.logger.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.error("Logger is configure correctly");
    	logger.info("Logger is configure correctly");
    	logger.debug("Logger is configure correctly");
    	logger.warn("Logger is configure correctly");
    	logger.fatal("Logger is configure correctly");
        System.out.println( "Hello World!" );
    }
}
