package me.jeonguk.object;


import me.jeonguk.enums.Culture;

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
