package me.jeongph.playground.auth;

public record LoginReq(
        String userId,

        String password
) {
}