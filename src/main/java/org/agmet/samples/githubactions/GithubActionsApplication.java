package org.agmet.samples.githubactions;

import org.agmet.samples.githubactions.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication implements CommandLineRunner {

	@Autowired
	private HelloWorldService helloWorldService;
	
	private static Logger log = LoggerFactory.getLogger(GithubActionsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

	public void run(String... args) throws Exception {
		helloWorldService.sayHello("People");
		log.info(helloWorldService.getMessage());
	}

}
