package com.example.moviesBackend;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static io.restassured.RestAssured.given;

public class PostTest {
    @Test
    void postUsingObjectMapping(){
        //this is the expected
        Movie movie =new Movie(3,"Aman","Hamdan",9,"Action");
       given().contentType(ContentType.JSON).
               body(movie).
               when().
               post("/create").
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
