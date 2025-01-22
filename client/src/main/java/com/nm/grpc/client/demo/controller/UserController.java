package com.nm.grpc.client.demo.controller;

import com.nm.grpc.client.demo.service.UserService;
import com.nm.grpc.common.dto.UserCreationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;


    @PostMapping("/create")
    public ResponseEntity<Boolean> createUser(@RequestBody UserCreationRequestDto creationRequest) {
        Boolean result = userService.createUser(creationRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

}
