package com.example.moviesBackend.models;

import jakarta.persistence.*;

@Entity
@Table
public class Movie {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String movieName;
    @Column
    private String director;
    @Column
    private String category;
    @Column
    private int rating;

    public Movie(final int id, final String movieName, final String director, final int rating, final String category) {
        this.id = id;
        this.movieName = movieName;
        this.director = director;
        this.rating = rating;
        this.category = category;
    }

    public Movie() {
    }

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

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                '}';
    }

}
