package com.example.moviesBackend;

public class Movie {
    int id;
    String movieName;
    String director;
    String category;
    int rating;

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
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public Movie(int id, String movieName, String director, int rating, String Category) {
        this.id = id;
        this.movieName = movieName;
        this.director = director;
        this.rating = rating;
        this.category = Category;
    }

}
