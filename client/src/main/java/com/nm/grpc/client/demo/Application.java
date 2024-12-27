package com.nm.grpc.client.demo;

import com.nm.grpc.client.demo.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		BankService bankService = context.getBean(BankService.class);
		bankService.getTransactions();
	}

}
