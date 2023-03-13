package com.example.moviesBackend;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class AnotherTest {
    @Test
    void responseExtract() {
        //base URI with Rest Assured class
        RestAssured.baseURI = "http://127.0.0.1:8080";
        //input details
        RequestSpecification h = RestAssured.given();
        //get response
        Response r = h.get("/create");
        //Response body
        ResponseBody bdy = r.getBody();
        //convert response body to string
        String b = bdy.asString();
        //JSON Representation from Response Body
        JsonPath j = r.jsonPath();
        //Get value of Location Key
        String l = j.get("movieName");
        System.out.println("movieName: " + l);
        String m = j.get("id");
        System.out.println("Movie Id: " + m);
        String n = j.get("rating");
        System.out.println("Rating: " + n);
    }
}
