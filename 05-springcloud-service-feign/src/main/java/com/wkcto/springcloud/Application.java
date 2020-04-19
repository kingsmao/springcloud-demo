package com.wkcto.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication //SpringBoot注解支持
//@EnableEurekaClient //开启eureka客户端支持
//@EnableCircuitBreaker //开启断路器功能

//@EnableDiscoveryClient @EnableEurekaClient 相似的

@SpringCloudApplication
@EnableFeignClients
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}