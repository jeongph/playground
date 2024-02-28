package me.jeongph.springplayground.integration;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import me.jeongph.springplayground.integration.config.AcceptanceTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeIntegrationTests extends AcceptanceTest {

    @Test
    @DisplayName("홈 조회: 200")
    void home() {
        // given

        // when
        ExtractableResponse<Response> actual = RestAssured
                .given().contentType("application/json").log().all()

                .when()
                .params(Map.of(
//                        "name", "home",
                        "age", 20
                ))
                .get("/home")

                .then().log().all()
                .extract();

        // then
        assertEquals(HttpStatus.OK.value(), actual.statusCode());
    }

    @Test
    @DisplayName("홈2 조회: 200")
    void home2() {
        // given

        // when
        ExtractableResponse<Response> actual = RestAssured
                .given().contentType("application/json").log().all()

                .when()
                .params(Map.of(
//                        "name", "home2",
                        "age", 22
                ))
                .get("/home2")

                .then().log().all()
                .extract();

        // then
        assertEquals(HttpStatus.OK.value(), actual.statusCode());
    }

}
