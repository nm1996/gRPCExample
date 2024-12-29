package com.nm.grpc.client.demo.controller.error;

import com.nm.grpc.client.demo.controller.BankController;
import com.nm.grpc.client.demo.exception.TransactionGrpcCallException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(assignableTypes = {
        BankController.class
})
public class BankControllerAdvice {


    @ExceptionHandler(TransactionGrpcCallException.class)
    public ResponseEntity<ErrorResponseDto> errorMessage(TransactionGrpcCallException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(createError(ex.getMessage()));
    }


    private ErrorResponseDto createError(String message) {
        return new ErrorResponseDto(message);
    }
}
