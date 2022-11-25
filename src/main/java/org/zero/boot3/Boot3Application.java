package org.zero.boot3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Boot3Application {

    private static final Logger logger = LoggerFactory.getLogger(Boot3Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Boot3Application.class, args);

        logger.info("Boot3Application main {}", Arrays.toString(args));
    }

}
