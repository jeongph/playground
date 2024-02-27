package me.jeongph.playground.controller;

import lombok.RequiredArgsConstructor;
import me.jeongph.playground.contract.TestContract;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequiredArgsConstructor
public class TestController implements TestContract {

    @Override
    public String test() {
        return OffsetDateTime.now().toString();
    }

}
