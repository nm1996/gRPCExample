package com.nm.grpc.client.demo.controller.error;

import com.nm.grpc.client.demo.controller.BankController;
import com.nm.grpc.client.demo.controller.UserController;
import com.nm.grpc.client.demo.exception.GrpcCallException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(assignableTypes = {
        BankController.class,
        UserController.class
})
public class GeneralErrorHandler {


    @ExceptionHandler(GrpcCallException.class)
    public ResponseEntity<ErrorResponseDto> errorMessage(GrpcCallException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(createError(ex.getMessage()));
    }


    private ErrorResponseDto createError(String message) {
        return new ErrorResponseDto(message);
    }
}
