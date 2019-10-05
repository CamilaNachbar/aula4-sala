package br.com.aula4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "br.com.aula4.entity.**")
@ComponentScan(basePackages = {"br.com.aula4.entity.**" })
public class Aula4Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula4Application.class, args);
	}

}
