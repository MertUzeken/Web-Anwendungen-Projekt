/**
For: Prof. Dr. Armin Lehmann
*Submitted by: 
*Mert Uzeken 1142543
*Aryan Baschir 1458978
*Dinara Kurmanbek 1346718
*Winter semester 2022/23
*Submission deadline: 05.03.2023
*/

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
