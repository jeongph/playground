package me.jeongph.playground.curiosity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTests {

    @Test
    @DisplayName("자바에서 .toList 를 하면 ImmutableCollections 형의 리스트를 반환한다.")
    void test() {
        // given
        var list = List.of("", "");

        // when
        var actual = list.stream().map(it -> it).toList();

        // then
        assertEquals(List.of().getClass(), actual.getClass());
    }

    @Test
    @DisplayName("자바에서 .collect(Collectors.toList()) 를 하면 ArrayList 형의 리스트를 반환한다.")
    void test2() {
        // given
        var list = List.of("", "");

        // when
        var actual = list.stream().map(it -> it).collect(Collectors.toList());

        // then
        assertEquals(ArrayList.class, actual.getClass());
    }

}
