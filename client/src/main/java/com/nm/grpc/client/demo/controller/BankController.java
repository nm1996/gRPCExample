package com.nm.grpc.client.demo.controller;

import com.nm.grpc.client.demo.service.BankService;
import com.nm.grpc.common.dto.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/bank")
public class BankController {

    private final BankService bankService;


    @GetMapping("/account/{accountNumber}")
    public ResponseEntity<List<Transaction>> getTransactionsByAccount(@PathVariable("accountNumber") String accountNumber) {
        List<Transaction> result = bankService.getTransactions(accountNumber);
        return ResponseEntity.ok(result);
    }

}
