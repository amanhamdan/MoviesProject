package com.example.moviesBackend;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;

public class Movie {
    int id;
    String movieName ;
    String director;
    String Category ;
    int rating ;
    public Movie() {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public Movie(int id, String movieName,  String director,int rating ,String Category )
    {
        this.id = id;
        this.movieName = movieName;
        this.director=director;
        this.rating=rating;
        this.Category=Category;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", Category='" + Category + '\'' +
                ", rating=" + rating +
                '}';
    }
}
