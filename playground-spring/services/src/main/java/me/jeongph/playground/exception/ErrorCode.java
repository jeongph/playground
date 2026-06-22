package me.jeongph.playground.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("ERROR_0001", "사용자를 찾을 수 없습니다."),
    ;

    private final String code;
    private final String message;
}
