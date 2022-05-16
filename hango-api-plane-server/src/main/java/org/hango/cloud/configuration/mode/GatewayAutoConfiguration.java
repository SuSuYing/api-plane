package org.hango.cloud.configuration.mode;

import org.hango.cloud.configuration.ApiPlaneAutoBaseConfiguration;
import net.devh.springboot.autoconfigure.grpc.server.GrpcServerLifecycle;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 网关模式下的configuration
 *
 * @Author chenjiahan | chenjiahan@corp.netease.com | 2020/6/15
 **/
@Profile({"gw-qz", "gw-yx"})
@Configuration
@AutoConfigureBefore(ApiPlaneAutoBaseConfiguration.class)
public class GatewayAutoConfiguration {

    // 不自动启用grpc server
    @Bean
    public GrpcServerLifecycle grpcServerLifecycle() {
        return null;
    }
}