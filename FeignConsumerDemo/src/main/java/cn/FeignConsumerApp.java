package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/7 10:13
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApp.class,args);
    }
}
