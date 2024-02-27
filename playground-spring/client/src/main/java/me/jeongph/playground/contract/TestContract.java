package me.jeongph.playground.contract;

import org.springframework.web.bind.annotation.GetMapping;

public interface TestContract {

    @GetMapping("/test")
    String test();

}
