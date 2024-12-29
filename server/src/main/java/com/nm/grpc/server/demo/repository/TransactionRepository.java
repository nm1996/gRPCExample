package com.nm.grpc.server.demo.repository;


import com.nm.grpc.common.dto.Transaction;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static com.nm.grpc.common.dto.TransactionType.*;
import static com.nm.grpc.common.dto.TransactionType.BONUS;

// fake repo
@Repository
public class TransactionRepository {

    public List<Transaction> fetchTransactions(String accountNumber, int daysDuration) {
        int transactionCount = generateTransactionCount(accountNumber, daysDuration);
        List<Transaction> transactions = new ArrayList<>();

        for (int i = 0; i < transactionCount; i++) {
            String transactionType = generateRandomTransactionType();
            BigDecimal amount = generateRandomAmount();
            String transactionId = UUID.randomUUID().toString();

            transactions.add(new Transaction(transactionId, transactionType, amount));
        }

        return transactions;
    }

    private int generateTransactionCount(String accountNumber, int daysDuration) {
        int baseCount = 5 + (accountNumber.length() % 5);
        return baseCount + (daysDuration / 30);
    }


    private String generateRandomTransactionType() {
        List<String> transactionTypes = Arrays.asList(DEPOSIT.getName(),
                WITHDRAWAL.getName(),
                TRANSFER.getName(),
                BONUS.getName()
        );
        return transactionTypes.get(ThreadLocalRandom.current().nextInt(transactionTypes.size()));
    }


    private BigDecimal generateRandomAmount() {
        double amount = ThreadLocalRandom.current().nextDouble(10.0, 500.0);
        return BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_UP);
    }

}
