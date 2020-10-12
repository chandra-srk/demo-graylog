package com.demo.greylog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoGreylogApplication {

	public static void main(String[] args) {
		log.trace("A TRACE Message");
		log.debug("A DEBUG Message");
		log.info("An INFO Message");
		log.warn("A WARN Message");
		log.error("An ERROR Message");
		SpringApplication.run(DemoGreylogApplication.class, args);
	}
}
