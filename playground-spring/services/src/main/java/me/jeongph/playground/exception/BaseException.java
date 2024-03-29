package me.jeongph.playground.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class BaseException extends RuntimeException {

    private final String timestamp;
    private final HttpStatus status;
    private final String code;
    private final String message;
    private final List<String> errors;
    private final String path;

    public BaseException(HttpStatus status, String code, String message, List<String> errors, String path) {
        this.timestamp = LocalDateTime.now().toString();
        this.status = status;
        this.code = code;
        this.message = message;
        this.errors = errors;
        this.path = path;
    }

    public ExceptionResponse toResponse() {
        return new ExceptionResponse(timestamp, status.value(), code, message, errors, path);
    }

}
