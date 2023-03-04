package edu.fra.uas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"edu.fra.uas","edu.fra.uas.controller.project"})

public class Gruppe24OnlineMusicEditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gruppe24OnlineMusicEditorApplication.class, args);
	}
}
