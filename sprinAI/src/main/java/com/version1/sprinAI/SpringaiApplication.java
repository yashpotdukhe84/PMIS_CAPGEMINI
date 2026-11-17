package com.version1.sprinAI;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringaiApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.directory("/")
				.filename(".env")
				.load();

		String apiKey = dotenv.get("GEMINI_API_KEY");

		System.setProperty("GEMINI_API_KEY", apiKey);

		SpringApplication.run(SpringaiApplication.class, args);
	}
}
