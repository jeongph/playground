package me.jeongph.playground.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.jeongph.playground.api.request.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> home(
            @RequestParam(value = "name", defaultValue = "World") String name,
            @RequestParam(value = "age", required = false, defaultValue = "0") int age
    ) {
        log.info("name: {}, age: {}", name, age);
        return ResponseEntity.ok("Hello, this is Spring Playground!");
    }

    @GetMapping("/home2")
    public ResponseEntity<String> home2(
            User user
    ) {
        log.info("user: {}", user);
        return ResponseEntity.ok("Hello, this is Spring Playground!");
    }

    @GetMapping("/get-record")
    public ResponseEntity<User> getRecord() {
        return ResponseEntity.ok(new User("jeongph", 3));
    }

}
