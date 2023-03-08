package com.example.moviesBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoviesBackendApplication.class, args);

		Movie[] movieArray;
		movieArray =new Movie[2];

		movieArray[0] = new Movie(1, "Pride and Prejudice", "Joe Wright", 5, "romance");
		movieArray[1] =new Movie(2,"Lucy","dont know",6,"Action");
       System.out.println(movieArray[0].toString());
	}

}
