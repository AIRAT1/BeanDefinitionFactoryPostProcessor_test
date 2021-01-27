package de.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	private static Terminator terminator;

	@Autowired
	public TestApplication(Terminator terminator) {
		this.terminator = terminator;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		terminator.say();
	}

}
