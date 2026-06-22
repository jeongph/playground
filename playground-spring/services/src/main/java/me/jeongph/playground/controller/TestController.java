package me.jeongph.playground.controller;

import lombok.RequiredArgsConstructor;
import me.jeongph.playground.client.web.contract.TestContract;
import me.jeongph.playground.exception.ErrorCode;
import me.jeongph.playground.exception.NotFoundException;
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
        throw new NotFoundException(ErrorCode.USER_NOT_FOUND);
    }

}
