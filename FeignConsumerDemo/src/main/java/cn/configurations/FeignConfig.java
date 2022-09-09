package cn.configurations;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @Description feign相关配置
 * @Author myf
 * @CreateDate 2022/9/7 10:37
 * @Version 1.0
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Retryer customFeignRetryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),3);
    }
}
