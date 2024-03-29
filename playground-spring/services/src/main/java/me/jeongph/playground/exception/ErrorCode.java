package me.jeongph.playground.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("ERROR_0001", "User not found"),
    ;

    private final String code;
    private final String message;
}
