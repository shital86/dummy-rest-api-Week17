package com.restapiexample.restApiInfo;

import com.restapiexample.model.RestApiPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateARecord extends TestBase {
    @Test
    public void updateARecord() {
        RestApiPojo restApiPojo=new RestApiPojo();
       restApiPojo.setName("Priya");


        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .put("/update/1");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
