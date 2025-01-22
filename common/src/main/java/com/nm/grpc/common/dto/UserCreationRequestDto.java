package com.nm.grpc.common.dto;

public record UserCreationRequestDto (
        String name,
        String lastName,
        Integer age
){
}
