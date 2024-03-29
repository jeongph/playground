package me.jeongph.playground.exception;

public record ExceptionResponse(
        String timestamp,
        Integer status,
        String code,
        String message,
        String path
) {
}
