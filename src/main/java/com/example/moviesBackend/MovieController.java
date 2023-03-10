package com.example.moviesBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/")
public class MovieController {
    @GetMapping("/show")
    public String getMovies() {
        return "hello this is show page";
    }


    @GetMapping("/moviesList")
    public List<Movie> movieArray() {
        return Arrays.asList(
                new Movie(1, "Pride and Prejudice", "Joe Wright", 10, "romance"),
                new Movie(2, "Lucy", "dont know", 6, "Action")
        );

    }

}
