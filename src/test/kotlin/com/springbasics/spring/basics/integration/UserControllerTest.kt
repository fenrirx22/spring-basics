package com.springbasics.spring.basics.integration

import io.restassured.RestAssured
import io.restassured.matcher.RestAssuredMatchers
import org.apache.http.HttpStatus
import org.junit.Before
import org.junit.Test
import java.util.regex.Matcher
import org.hamcrest.Matchers.*

class UserControllerTest : BaseIntegrationTest() {

    @Before
    fun setup() {
    }

    @Test
    fun getUsersShouldReturn200() {
        RestAssured.given()
                .port(port)
                .param("name", "Jan")
                .get("/user")
                .then()
                .body("name", `is`("Jan"))
                .body("lastName", `is`("Kowalski"))
                .statusCode(HttpStatus.SC_OK)

    }
}