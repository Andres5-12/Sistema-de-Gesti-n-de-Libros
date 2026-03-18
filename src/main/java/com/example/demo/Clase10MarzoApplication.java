package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase10MarzoApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(Clase10MarzoApplication.class, args);
	}

	private static void loadEnv() {
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.ignoreIfMalformed()
				.load();

		String dbUrl = dotenv.get("DB_URL");
		String dbUser = dotenv.get("DB_USER");
		String dbPassword = dotenv.get("DB_PASSWORD");


		if (dbUrl != null) System.setProperty("DB_URL", dbUrl);
		if (dbUser != null) System.setProperty("DB_USERNAME", dbUser);  //
		if (dbPassword != null) System.setProperty("DB_PASSWORD", dbPassword);
	}
}