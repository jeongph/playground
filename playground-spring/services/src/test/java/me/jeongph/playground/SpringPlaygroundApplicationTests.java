package me.jeongph.playground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringPlaygroundApplication.class)
class SpringPlaygroundApplicationTests {

    @Test
    @DisplayName("스프링 부트 애플리케이션 로드 테스트")
    void contextLoads() {
    }

}
