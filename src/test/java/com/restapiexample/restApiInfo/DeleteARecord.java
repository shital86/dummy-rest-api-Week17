package com.restapiexample.restApiInfo;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteARecord extends TestBase {

    @Test
    public void deleteARecord(){
        Response response = given()
                .pathParam("id",1)
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

