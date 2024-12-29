package com.nm.grpc.client.demo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "target.server")
@Data
public class GrpcServerProperties {

    private String host = "localhost";
    private int port = 8090;
}