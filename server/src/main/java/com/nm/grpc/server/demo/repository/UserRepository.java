package com.nm.grpc.server.demo.repository;

import com.nm.grpc.common.dto.UserCreationRequestDto;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public boolean createUser(UserCreationRequestDto dto) {
        return dto.age() > 20;
    }
}
