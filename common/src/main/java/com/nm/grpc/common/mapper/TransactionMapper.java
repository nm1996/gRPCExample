package com.nm.grpc.common.mapper;

import com.javainuse.banking.BigDecimalProto;
import com.javainuse.banking.TransactionDetail;
import com.nm.grpc.common.dto.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@RequiredArgsConstructor
@Component
public class TransactionMapper {

    private final BigDecimalProtoMapper bigDecimalProtoMapper;


    public TransactionDetail toProto(Transaction transaction) {
        BigDecimalProto amount = bigDecimalProtoMapper.toProto(transaction.getAmount());

        return TransactionDetail.newBuilder()
                .setTransactionId(transaction.getId())
                .setTransactionType(transaction.getType())
                .setTransactionAmount(amount)
                .build();
    }

    public Transaction toDto(TransactionDetail proto){
        BigDecimal amount = bigDecimalProtoMapper.toDto(proto.getTransactionAmount());

        return Transaction.builder()
                .id(proto.getTransactionId())
                .type(proto.getTransactionType())
                .amount(amount)
                .build();
    }

}
