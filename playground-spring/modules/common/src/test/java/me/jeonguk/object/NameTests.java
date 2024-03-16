package me.jeonguk.object;

import me.jeonguk.enums.Culture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameTests {

    @BeforeEach
    void setUp() {
    }

    @DisplayName("fullName 메서드는 문화별 전체 이름을 반환한다.")
    @ParameterizedTest
    @CsvSource(value = {
            "정욱, 박, KOREA, 박정욱",
            "JeongUk, Park, AMERICA, JeongUk Park"
    })
    void fullName(String firstName, String lastName, Culture culture, String expected) {
        // given
        Name name = new Name(firstName, lastName);

        // when
        String actual = name.fullName(culture);

        // then
        assertEquals(expected, actual);
    }

}