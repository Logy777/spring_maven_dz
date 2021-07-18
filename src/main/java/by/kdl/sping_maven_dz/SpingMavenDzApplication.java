package by.kdl.sping_maven_dz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpingMavenDzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingMavenDzApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "<h1>Hello World from a Spring boot Java application! Hi there))<h1>";
	}
}