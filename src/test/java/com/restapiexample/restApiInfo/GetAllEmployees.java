package com.restapiexample.restApiInfo;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllEmployees extends TestBase {
    @Test
    public void getAllEmployees() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);

    }
}

