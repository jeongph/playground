package me.jeongph.playground.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE + 100)
public class BaseControllerAdvice {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ExceptionResponse> handleException(HttpServletRequest request, BaseException e) {
        log.error("Error occurred: {}", e.toString());
        String requestURI = request.getRequestURI(); // 안에 뭐가 더들었나 궁금쓰
        return new ResponseEntity<>(e.toResponse(requestURI), e.getStatus());
    }

}
