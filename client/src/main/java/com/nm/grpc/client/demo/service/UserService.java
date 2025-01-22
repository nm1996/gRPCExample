package com.nm.grpc.client.demo.service;

import banking.UserCreation;
import com.nm.grpc.client.demo.config.GrpcServiceConfig;
import com.nm.grpc.common.dto.UserCreationRequestDto;
import com.nm.grpc.common.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static banking.UserCreation.*;


@Service
public class UserService {

    private final UserCreationServiceClient userCreationServiceClient;
    private final UserMapper userMapper;

    @Autowired
    public UserService(@Qualifier(GrpcServiceConfig.USER_CREATION_SERVICE_CLIENT) UserCreationServiceClient userCreationServiceClient, UserMapper userMapper) {
        this.userCreationServiceClient = userCreationServiceClient;
        this.userMapper = userMapper;
    }

    public Boolean createUser(UserCreationRequestDto dto) {
        UserCreationRequest request = userMapper.toProto(dto);
        UserCreationResponse response = userCreationServiceClient.createUser(request);
        return response.getIsCreated();
    }
}
