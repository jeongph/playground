package me.jeongph.springplayground.temp;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import me.jeongph.springplayground.integration.config.AcceptanceTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTests extends AcceptanceTest {

    @Test
    @DisplayName("Record 는 getter 이름으로 필드를 추적해주기도 한다")
    void recordTest() {
        ExtractableResponse<Response> actual = RestAssured
                .given().contentType("application/json").log().all()

                .when()
                .get("/get-record")

                .then().log().all()
                .extract();

        Object nickName = actual.body().path("nickName");
        assertEquals("jeongph 3", nickName);
    }

}
