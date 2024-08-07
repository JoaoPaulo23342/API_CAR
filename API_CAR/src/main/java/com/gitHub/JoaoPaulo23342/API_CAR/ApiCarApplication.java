package com.gitHub.JoaoPaulo23342.API_CAR;

import com.gitHub.JoaoPaulo23342.API_CAR.Main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiCarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.Menu();
	}
}

