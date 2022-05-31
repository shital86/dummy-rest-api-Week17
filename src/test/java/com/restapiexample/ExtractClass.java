package com.restapiexample;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ExtractClass extends TestBase {
    @Test
    public void test() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);

        System.out.println("------------Response from the Records---------------");
        List<String> totalRecords = response.then().extract().path("data");
        System.out.println("1. Total numbers of Record :" + totalRecords);

        int id = response.then().extract().path("data[23].id");
        System.out.println("2. data[23].id :" + id);

        String employeeName = response.then().extract().path("data[23].employee_name");
        System.out.println("3.data[23].employee_name:" + employeeName);

        String message = response.then().extract().path("message");
        System.out.println("4. Message :" + message);

        String status = response.then().extract().path("status");
        System.out.println("5.Status                     :" + status);

        List<Integer> employeeSalary = response.then().extract().path("data.findAll{it.id==3}.employee_salary");
        System.out.println("6.id = 3 has employee_salary :" + employeeSalary);

        List<Integer> employeeage = response.then().extract().path("data.findAll{it.id==6}.employee_age");
        System.out.println("7. id = 3 has employee_salary :" + employeeage);

        List<?> employeeName1 = response.then().extract().path("data.findAll{it.id==11}.employee_name");
        System.out.println("8. id = 3 has employee_salary :" + employeeName1);

        System.out.println("----------- End of Response ----------------------");
        response.prettyPrint();

    }
}