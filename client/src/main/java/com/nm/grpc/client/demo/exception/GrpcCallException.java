package com.nm.grpc.client.demo.exception;

public class GrpcCallException extends RuntimeException {

    public GrpcCallException(String message) {
        super(message);
    }

}
