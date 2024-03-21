package me.jeongph.playground.api.request;

public record User(
        String name,
        int age
) {

    public String getNickName() {
        return name + " " + age;
    }

}
