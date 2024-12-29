package com.nm.grpc.client.demo.exception;

public class TransactionGrpcCallException extends RuntimeException {

    public TransactionGrpcCallException(String message) {
        super(message);
    }

}
