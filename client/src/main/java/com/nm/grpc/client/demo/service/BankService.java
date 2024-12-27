package com.nm.grpc.client.demo.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
public class BankService {


    public void getTransactions() throws InterruptedException {

        TransactionServiceClient client = new TransactionServiceClient("localhost", 8090);
        client.streamTransactions("123456789", 30);
        new CountDownLatch(1).await();
        client.shutdown();

    }
}
