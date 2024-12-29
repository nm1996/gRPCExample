package com.nm.grpc.server.demo.service;

import com.javainuse.banking.AccountRequest;
import com.javainuse.banking.TransactionDetail;
import com.javainuse.banking.TransactionDetailList;
import com.javainuse.banking.TransactionServiceGrpc.TransactionServiceImplBase;
import com.nm.grpc.common.dto.Transaction;
import com.nm.grpc.common.mapper.TransactionMapper;
import com.nm.grpc.server.demo.repository.TransactionRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@GrpcService
public class TransactionHistoryService extends TransactionServiceImplBase {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    @Override
    public void getTransactions(AccountRequest request, StreamObserver<TransactionDetailList> responseObserver) {
        List<Transaction> transactions = transactionRepository.fetchTransactions(request.getAccountNumber(), request.getDurationInDays());

        try {
            List<TransactionDetail> transactionDetails = transactions.stream()
                    .map(transactionMapper::toProto)
                    .toList();

            TransactionDetailList result = TransactionDetailList.newBuilder()
                    .addAllTransactionDetails(transactionDetails)
                    .build();

            responseObserver.onNext(result);
        } catch (Exception e) {
            log.info("Error while fetching transactions [message= {}, accountNumber= {}]", e.getMessage(), request.getAccountNumber());
            responseObserver.onError(e);
        }

        responseObserver.onCompleted();
    }

}
