package me.jeongph.playground.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
public class BaseException extends RuntimeException {

    private final String timestamp;
    private final HttpStatus status;
    private final String code;
    private final String message;
    private final List<String> errors;

    public BaseException(HttpStatus status, ErrorCode code, List<String> errors) {
        this.timestamp = LocalDateTime.now().toString();
        this.status = status;
        this.code = code.getCode();
        this.message = code.getMessage();
        this.errors = errors;
    }

    public ExceptionResponse toResponse(String path) {
        return new ExceptionResponse(timestamp, status.value(), code, message, path);
    }

}
