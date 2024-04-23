package me.jeongph.playground.auth;

public interface AuthService {

    Long signup(SignupReq req);

    LoginRes login(LoginReq req);

}
