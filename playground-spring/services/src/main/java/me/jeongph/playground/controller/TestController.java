package me.jeongph.playground.controller;

import lombok.RequiredArgsConstructor;
import me.jeongph.playground.contract.TestContract;
import me.jeongph.playground.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequiredArgsConstructor
public class TestController implements TestContract {

    @Override
    public String test() {
        return OffsetDateTime.now().toString();
    }

    @GetMapping("/throw")
    public String returnThrow() {
        throw new BaseException(HttpStatus.NOT_FOUND, "NOT_FOUND", "Not Found", null, "/throw");
    }

}
