package com.nm.grpc.client.demo.service;

import com.javainuse.banking.AccountRequest;
import com.javainuse.banking.TransactionDetailList;
import com.javainuse.banking.TransactionServiceGrpc;
import com.nm.grpc.client.demo.exception.TransactionGrpcCallException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

@Slf4j
public class TransactionServiceClient implements AutoCloseable {

    private final ManagedChannel channel;
    private final TransactionServiceGrpc.TransactionServiceBlockingStub blockingStub;


    private ManagedChannel createChannel(String host, int port) {
        return ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
    }

    public TransactionServiceClient(String host, int port) {
        channel = createChannel(host, port);
        blockingStub = TransactionServiceGrpc.newBlockingStub(channel);


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                shutdown();
            } catch (InterruptedException e) {
                log.error("Error during channel shutdown: ", e);
            }
        }));
    }

    public TransactionDetailList getTransactionsByAccountAndDuration(String accountNumber, int durationInDays) throws TransactionGrpcCallException {
        AccountRequest request = AccountRequest.newBuilder()
                .setAccountNumber(accountNumber)
                .setDurationInDays(durationInDays)
                .build();

        try {
            return blockingStub.getTransactions(request);
        } catch (Exception e) {
            log.error("Error while fetching transactions [message={}]", e.getMessage());
            throw new TransactionGrpcCallException(e.getMessage());
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
