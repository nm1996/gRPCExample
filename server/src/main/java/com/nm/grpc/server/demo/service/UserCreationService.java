package com.nm.grpc.server.demo.service;

import banking.UserCreationServiceGrpc.UserCreationServiceImplBase;
import com.nm.grpc.common.dto.UserCreationRequestDto;
import com.nm.grpc.common.mapper.UserMapper;
import com.nm.grpc.server.demo.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import static banking.UserCreation.*;

@Slf4j
@RequiredArgsConstructor
@GrpcService
public class UserCreationService extends UserCreationServiceImplBase {

    private final UserRepository repository;
    private final UserMapper userMapper;


    @Override
    public void userCreate(UserCreationRequest request, StreamObserver<UserCreationResponse> responseObserver) {
        UserCreationRequestDto dto = userMapper.toDto(request);
        boolean isPersisted = repository.createUser(dto);

        log.info("User creation executed [isUserCreated={}]", isPersisted);

        try {
            UserCreationResponse response = UserCreationResponse.newBuilder()
                    .setIsCreated(isPersisted)
                    .build();

            responseObserver.onNext(response);
        } catch (Exception e) {
            log.error("Error happen while creating user [message={}]", e.getMessage());
            responseObserver.onError(e);
        } finally {
            responseObserver.onCompleted();
        }
    }
}
