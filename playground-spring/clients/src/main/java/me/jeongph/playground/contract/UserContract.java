package me.jeongph.playground.contract;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import me.jeongph.playground.request.UserCreateReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "사용자 API")
public interface UserContract {

    @Operation(summary = "사용자 등록")
    @PostMapping("/users")
    String createUser(
            @RequestBody UserCreateReq req
    );

}
