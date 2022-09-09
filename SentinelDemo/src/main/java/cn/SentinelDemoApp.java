package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/8 14:44
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SentinelDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SentinelDemoApp.class,args);
    }
}
