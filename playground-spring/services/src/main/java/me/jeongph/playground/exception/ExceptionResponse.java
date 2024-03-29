package me.jeongph.playground.exception;

import java.util.List;

public record ExceptionResponse(
        String timestamp,
        Integer status,
        String code,
        String message,
        List<String> errors,
        String path
) {
}
