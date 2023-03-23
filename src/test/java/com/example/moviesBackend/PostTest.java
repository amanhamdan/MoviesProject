package com.example.moviesBackend;

import com.example.moviesBackend.models.Movie;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class PostTest {
    @Test
    void postUsingObjectMapping(){
        //this is the expected
        Movie movie =new Movie(3,"Aman","Hamdan",9,"Action");
       given().contentType(ContentType.JSON).
               body(movie).
               when().
               post("/new").
               then().
               statusCode(HttpStatus.SC_CREATED).
               body(
                       "id", equalTo(movie.getId()),
                       "movieName", equalTo(movie.getMovieName()),
                       "director", equalTo(movie.getDirector()),
                       "rating", equalTo(movie.getRating()),
                       "category",equalTo(movie.getCategory())


               );



    }
}
