package com.nm.grpc.server.demo.config;

import com.nm.grpc.common.config.CommonConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({CommonConfig.class})
@Configuration
public class ServerConfig {
}
