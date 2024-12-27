package com.nm.grpc.client.demo.service;

import com.javainuse.banking.AccountRequest;
import com.javainuse.banking.TransactionDetailList;
import com.javainuse.banking.TransactionServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class TransactionServiceClient {

    private final ManagedChannel channel;
    private final TransactionServiceGrpc.TransactionServiceStub asyncStub;

    public TransactionServiceClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build()
        );
    }

    public TransactionServiceClient(ManagedChannel channel) {
        this.channel = channel;
        asyncStub = TransactionServiceGrpc.newStub(channel);
    }

    public void streamTransactions(String accountNumber, int durationInDays) {
        AccountRequest request = AccountRequest.newBuilder()
                .setAccountNumber(accountNumber)
                .setDurationInDays(durationInDays)
                .build();

        asyncStub.streamTransactions(request, new StreamObserver<>() {

            @Override
            public void onNext(TransactionDetailList transactionDetail) {
                log.info("Received transaction detail [{}]", transactionDetail);
            }

            @Override
            public void onError(Throwable throwable) {
                log.error("Error occurred during transaction streaming [message={}]", throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("Transaction streaming completed");
            }
        });
    }


    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

}
