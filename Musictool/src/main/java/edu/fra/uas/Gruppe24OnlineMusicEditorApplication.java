package edu.fra.uas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RestController
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"edu.fra.uas","edu.fra.uas.controller.project"})

public class Gruppe24OnlineMusicEditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gruppe24OnlineMusicEditorApplication.class, args);
	}


	@GetMapping ("hello") 
	public List<String> hello() {
		return List.of("Hello", "World", "ht");
	}

}
