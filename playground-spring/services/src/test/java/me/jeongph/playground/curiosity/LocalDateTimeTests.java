package me.jeongph.playground.curiosity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalDateTimeTests {

    @Test
    @DisplayName("LocalDateTime을 응용해서 for 문 사용하기")
    void test() {
        // given
        LocalDate januaryFirstDay = LocalDate.of(2024, 1, 1);
        LocalDate februaryFirstDay = LocalDate.of(2024, 2, 1);

        // when
        int actual = 0;
        for (LocalDate date = januaryFirstDay; date.isBefore(februaryFirstDay); date = date.plusDays(1)) {
            ++actual;
        }

        // then
        assertEquals(31, actual);
    }
}
