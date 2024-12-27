package com.nm.grpc.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {
        "com.nm.grpc.common.dto",
        "com.nm.grpc.common.mapper"
})
@Configuration
public class CommonConfig {
}
