package org.agmet.samples.githubactions.service.impl;

import org.agmet.samples.githubactions.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HelloWorldServiceImpl implements HelloWorldService {
	
	private static Logger log = LoggerFactory.getLogger(HelloWorldServiceImpl.class);
	
	@Override
	public void sayHello(String message) {
		log.info("Hello World : {}", message);
	}

	@Override
	public String getMessage() {
		return "Hello World";
	}

}
