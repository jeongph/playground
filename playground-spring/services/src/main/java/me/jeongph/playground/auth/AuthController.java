package me.jeongph.playground.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements AuthContract {

    private final AuthService authService;

    @Override
    public ResponseEntity<Long> signup(SignupReq req) {
        Long signup = authService.signup(req);

        return ResponseEntity.ok(signup);
    }

    @Override
    public ResponseEntity<LoginRes> login(LoginReq req) {
        LoginRes loginRes = authService.login(req);

        return ResponseEntity.ok(loginRes);
    }

}