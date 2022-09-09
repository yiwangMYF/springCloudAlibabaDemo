package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 *              1.@EnableDiscoveryClient 开启nacos服务注册和发现
 *              2.EnableHystrix 开启熔断器
 * @Author myf
 * @CreateDate 2022/9/6 17:16
 * @Version 1.0
 **/
@SpringBootApplication
@ComponentScan("cn.*")
@EnableDiscoveryClient
@EnableHystrix
public class NacosConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApp.class,args);
    }
    /**
    * @Author myf
    * @Description //TODO @LoadBalanced注解开启ribbo负载均衡，通过给restTemplate添加拦截器实现的
    * @Date 2022/9/7 9:35
    * @Param []
    * @return org.springframework.web.client.RestTemplate
    */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
