package me.jeongph.playground.client.web.contract;

import org.springframework.web.bind.annotation.GetMapping;

public interface TestContract {

    @GetMapping("/test")
    String test();

}
