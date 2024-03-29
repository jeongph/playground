package me.jeongph.playground.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class NotFoundException extends BaseException {

    public NotFoundException(ErrorCode code) {
        super(HttpStatus.NOT_FOUND, code, List.of());
    }

}
