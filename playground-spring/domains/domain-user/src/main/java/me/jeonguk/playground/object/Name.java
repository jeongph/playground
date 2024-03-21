package me.jeonguk.playground.object;

import me.jeonguk.playground.enums.Culture;

public record Name(
        String firstName,
        String lastName
) {

    public String fullName(Culture culture) {
        return switch (culture) {
            case KOREA -> lastName + firstName;
            case AMERICA -> firstName + " " + lastName;
        };
    }

}
