package com.nm.grpc.client.demo.config;

import com.nm.grpc.client.demo.service.TransactionServiceClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(GrpcServerProperties.class)
@Configuration
public class GrpcServiceConfig {

    public final static String TRANSACTION_SERVICE_CLIENT = "transactionServiceClient";

    @Bean(TRANSACTION_SERVICE_CLIENT)
    public TransactionServiceClient transactionServiceClient(GrpcServerProperties serverProperties) {
        return new TransactionServiceClient(serverProperties.getHost(), serverProperties.getPort());
    }
}
