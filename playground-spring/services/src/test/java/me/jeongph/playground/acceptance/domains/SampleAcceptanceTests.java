package me.jeongph.playground.acceptance.domains;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import me.jeongph.playground.acceptance.config.AcceptanceTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("[인수 테스트] 샘플")
public class SampleAcceptanceTests extends AcceptanceTest {

    @Nested
    @DisplayName("샘플 요청")
    class SampleTest {

        @Test
        @DisplayName("샘플 테스트")
        void sampleTest() {
            // given

            // when
            ExtractableResponse<Response> response = defaultRestAssured()
                    .when()
                    .get("/")
                    .then().log().all().extract();

            // then
            JsonPath actual = response.body().jsonPath();
            assertAll(() -> {
            });
        }
    }

}
