package com.restapiexample.restApiInfo;

import com.restapiexample.model.RestApiPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateANewRecord extends TestBase {
    @Test
    public void createANewRecord() {

        RestApiPojo restAPIPojo = new RestApiPojo();
        restAPIPojo.setName("Kim");
        restAPIPojo.setAge(35);
        restAPIPojo.setSalary(800000);
        restAPIPojo.setStatus("success");


        Response response = given()
                .header("Content-Type", "application/json")
                .body(restAPIPojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
