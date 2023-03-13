package com.example.moviesBackend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
                new Movie(2, "Lucy", "LUC BESSON", 6, "Action")
        );

    }

    @PostMapping("/create")
    @ResponseBody
    @ResponseStatus( HttpStatus.CREATED )
    public Movie createMovie(@RequestBody Movie movie) {
        Movie movie1 = new Movie(3, "Aman", "Hamdan", 9, "Action");
        return movie1;

    }



}
