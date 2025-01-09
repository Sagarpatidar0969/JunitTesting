package com.rays.unittt;

import org.apache.log4j.Logger;

public class TestLog4j {

    public static void main(String[] args) {

        // Create a logger instance
        Logger log = Logger.getLogger(TestLog4j.class);

        // Log messages with different levels
        log.debug("This is Debug...!!");
        log.info("This is Info...!!");
        log.warn("This is Warn...!!");
        log.error("This is Error...!!");
        log.fatal("This is Fatal...!!");

        try {

            int i = 0;

            // This will cause an ArithmeticException
            int c = 5/ i;

            System.out.println("Division = " + c);

        } catch (RuntimeException e) {
            // Log the exception with message
            log.info("Arithmetic Error", e);
        }
    }
}
