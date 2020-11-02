package org.acme.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingResourceTest {

    @Test
    fun testErrEndpoint() {
        given()
          .`when`().get("/err")
          .then()
             .statusCode(200)
             .body(`is`("err"))
    }

    @Test
    fun testOkEndpoint() {
        given()
                .`when`().get("/ok")
                .then()
                .statusCode(200)
                .body(`is`("ok"))
    }

    @Test
    fun testHelloEndpoint() {
        given()
                .`when`().get("/hello")
                .then()
                .statusCode(200)
                .body(`is`("hello world"))
    }

}