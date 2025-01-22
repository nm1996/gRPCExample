package com.nm.grpc.client.demo.service;

import com.nm.grpc.client.demo.exception.GrpcCallException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import static banking.UserCreation.*;
import static banking.UserCreationServiceGrpc.*;

import java.util.concurrent.TimeUnit;

@Slf4j
public class UserCreationServiceClient implements AutoCloseable {

    private final ManagedChannel channel;
    private final UserCreationServiceBlockingStub blockingStub;


    private ManagedChannel createChannel(String host, int port) {
        return ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
    }

    public UserCreationServiceClient(String host, int port) {
        channel = createChannel(host, port);
        blockingStub = newBlockingStub(channel);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                shutdown();
            } catch (InterruptedException e) {
                log.error("Error during channel shutdown: ", e);
            }
        }));
    }


    public UserCreationResponse createUser(UserCreationRequest request) {
        try{
            return blockingStub.userCreate(request);
        } catch (Exception e) {
            log.error("Error while creating user [message={}]", e.getMessage());
            throw new GrpcCallException(e.getMessage());
        }
    }


    public void shutdown() throws InterruptedException {
        channel.shutdown()
                .awaitTermination(5, TimeUnit.SECONDS);
    }

    @Override
    public void close() throws Exception {
        shutdown();
    }
}
