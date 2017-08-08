package com.springbasics.spring.basics.component

import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.junit.Test
import org.hamcrest.Matchers.*

class UserControllerTest : BaseIntegrationTest() {

    @Test
    fun getUsersWithNameJanShouldReturnOneUserWithNameJanAndLastnameKowalski_STATUS200() {
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