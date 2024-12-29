package com.nm.grpc.client.demo.controller.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorResponseDto {

    private final String message;
}
