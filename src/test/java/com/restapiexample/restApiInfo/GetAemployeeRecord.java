package com.restapiexample.restApiInfo;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAemployeeRecord extends TestBase {
    @Test
    public void getSingleEmployee() {
        Response response = given()
                .pathParam("id", 4)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
