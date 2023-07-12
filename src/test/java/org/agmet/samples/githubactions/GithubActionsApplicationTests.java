package org.agmet.samples.githubactions;

import static org.assertj.core.api.Assertions.assertThat;

import org.agmet.samples.githubactions.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubActionsApplicationTests {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetMessage() {
		String message = "Hello World";
		
		assertThat(helloWorldService.getMessage()).isEqualTo(message);
	}

}
