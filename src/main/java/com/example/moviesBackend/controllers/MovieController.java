package com.example.moviesBackend.controllers;

import com.example.moviesBackend.models.Movie;
import com.example.moviesBackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class MovieController {
    @Autowired
    MovieService movieService ;
    @GetMapping("/movie")
    private List<Movie> getAllMovies()
    {
        return movieService.getAllMovies();
    }
    //creating a get mapping that retrieves the detail of a specific movie
    @GetMapping("/movie/{id}")
    private Movie getMovie(@PathVariable("id") int id)
    {
        return movieService.getMovieById(id);
    }
    //creating delete mapping that deletes a specific movie
    @DeleteMapping("/movie/{id}")
    private void deleteMovie(@PathVariable("id") int id)
    {
        movieService.delete(id);
    }
    //creating post mapping that post the movie detail in the database
    @PostMapping("/movie")
    private int saveMovie(@RequestBody Movie movie)
    {
        movieService.saveOrUpdate(movie);
        return movie.getId();
    }
    //*********************************************************************
    @GetMapping("/show")
    public String getMovies() {
        return "hello this is show page";
    }


    @PostMapping("/new")
    @ResponseBody
    @ResponseStatus( HttpStatus.CREATED )
    public void createMovie(@RequestBody Movie movie) {
      //  movieService.save(movie);

    }

    @GetMapping("/list")
    public List<Movie> movieArray() {
        return Arrays.asList(
                new Movie(1, "Pride and Prejudice", "Joe Wright", 10, "romance","dd","body dksjn"),
                new Movie(2, "Lucy", "LUC BESSON", 6, "Action","dd","body sjkado")
        );

    }



}
