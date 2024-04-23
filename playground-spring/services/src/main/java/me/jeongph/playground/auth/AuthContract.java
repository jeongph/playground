package me.jeongph.playground.auth;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "인증 API")
public interface AuthContract {

    @Operation(summary = "회원가입 API")
    @PostMapping("/signup")
    ResponseEntity<Long> signup(
            @RequestBody SignupReq req
    );

    @Operation(summary = "로그인 API")
    @PostMapping("/login")
    ResponseEntity<LoginRes> login(
            @RequestBody LoginReq req
    );

}