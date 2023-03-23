package com.example.moviesBackend.service;

import com.example.moviesBackend.models.Movie;
import com.example.moviesBackend.repos.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepo movieRepo;
    //getting all  records
    public List<Movie> getAllMovies()
    {
        List<Movie> movies = new ArrayList<Movie>();
        movieRepo.findAll().forEach(movie -> movies.add(movie));
        return movies;
    }
    //getting a specific record
    public Movie getMovieById(int id)
    {
        return movieRepo.findById(id).get();
    }
    public void saveOrUpdate(Movie movie)
    {
        movieRepo.save(movie);
    }
    //deleting a specific record
    public void delete(int id)
    {
        movieRepo.deleteById(id);
    }
}
