package me.jeongph.playground.integration.config;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import me.jeongph.playground.SpringPlaygroundApplication;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = SpringPlaygroundApplication.class,
        properties = "spring.profiles.active=test"
)
public class AcceptanceTest {

    @LocalServerPort
    int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    public RequestSpecification defaultRestAssured() {
        return RestAssured
                .given().contentType("application/json").log().all();
    }

}
