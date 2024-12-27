package com.nm.grpc.server.demo.service;

import com.javainuse.banking.AccountRequest;
import com.javainuse.banking.TransactionDetail;
import com.javainuse.banking.TransactionDetailList;
import com.javainuse.banking.TransactionServiceGrpc.TransactionServiceImplBase;
import com.nm.grpc.common.dto.Transaction;
import com.nm.grpc.common.mapper.TransactionMapper;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.nm.grpc.common.dto.TransactionType.*;

@Slf4j
@RequiredArgsConstructor
@GrpcService
public class TransactionHistoryService extends TransactionServiceImplBase {

    private final TransactionMapper mapper;


    @Override
    public void streamTransactions(AccountRequest request, StreamObserver<TransactionDetailList> responseObserver) {
        List<Transaction> transactions = fetchTransactions();
        int batchSize = 3;

        for (int i = 0; i < transactions.size(); i += batchSize) {
            int endIndex = Math.min(i + batchSize, transactions.size());
            List<Transaction> batchTransactions = transactions.subList(i, endIndex);

            TransactionDetailList.Builder transactionDetailListBuilder = TransactionDetailList.newBuilder();

            for (Transaction transaction : batchTransactions) {
                TransactionDetail transactionDetail = mapper.toProto(transaction);
                transactionDetailListBuilder.addTransactionDetails(transactionDetail);
            }
            TransactionDetailList transactionDetailList = transactionDetailListBuilder.build();

            responseObserver.onNext(transactionDetailList);


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                log.error("Error happen on publishing [message = {}]", e.getMessage());
                responseObserver.onError(e);
                return;
            }
        }

        responseObserver.onCompleted();
    }


    private List<Transaction> fetchTransactions() {
        Transaction transaction1 = new Transaction("1", DEPOSIT.getName(), BigDecimal.valueOf(100.0));
        Transaction transaction2 = new Transaction("2", WITHDRAWAL.getName(), BigDecimal.valueOf(65));
        Transaction transaction3 = new Transaction("3", TRANSFER.getName(), BigDecimal.valueOf(200));
        Transaction transaction4 = new Transaction("4", DEPOSIT.getName(), BigDecimal.valueOf(70));
        Transaction transaction5 = new Transaction("5", WITHDRAWAL.getName(), BigDecimal.valueOf(30));
        Transaction transaction6 = new Transaction("6", BONUS.getName(), BigDecimal.valueOf(46));

        return new ArrayList<>(
                Arrays.asList(
                        transaction1,
                        transaction2,
                        transaction3,
                        transaction4,
                        transaction5,
                        transaction6
                ));
    }
}
