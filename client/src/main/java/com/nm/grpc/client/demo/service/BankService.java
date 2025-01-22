package com.nm.grpc.client.demo.service;


import com.nm.grpc.client.demo.config.GrpcServiceConfig;
import com.nm.grpc.common.dto.Transaction;
import com.nm.grpc.common.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    private final static Integer DAY_PERIOD = 7;

    private final TransactionServiceClient transactionServiceClient;
    private final TransactionMapper transactionMapper;

    @Autowired
    public BankService(@Qualifier(GrpcServiceConfig.TRANSACTION_SERVICE_CLIENT) TransactionServiceClient transactionServiceClient, TransactionMapper transactionMapper){
        this.transactionServiceClient = transactionServiceClient;
        this.transactionMapper = transactionMapper;
    }


    public List<Transaction> getTransactions(String accountNumber){
        return transactionServiceClient.getTransactionsByAccountAndDuration(accountNumber, DAY_PERIOD).getTransactionDetailsList().stream()
                .map(transactionMapper::toDto)
                .toList();
    }


}
