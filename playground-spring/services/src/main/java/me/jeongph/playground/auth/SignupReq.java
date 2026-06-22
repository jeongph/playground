package me.jeongph.playground.auth;

public record SignupReq(
        String userId,

        String password,

        String name,

        String regNo
) {
}