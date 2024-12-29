package com.nm.grpc.client.demo.service;


import com.nm.grpc.common.dto.Transaction;
import com.nm.grpc.common.mapper.TransactionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BankService {

    private final static Integer DAY_PERIOD = 7;

    private final TransactionServiceClient transactionServiceClient;
    private final TransactionMapper transactionMapper;


    public List<Transaction> getTransactions(String accountNumber){
        return transactionServiceClient.getTransactionsByAccountAndDuration(accountNumber, DAY_PERIOD).getTransactionDetailsList().stream()
                .map(transactionMapper::toDto)
                .toList();
    }


}
