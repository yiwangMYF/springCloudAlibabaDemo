package cn;

import cn.utils.RestTemplateExcUtil;
import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: --------------待完成--------------------
*               sentinel支持restemplate调用时的限流和熔断降级
 *              1.在RestTemplate实例上使用@SentinelRestTemplate注解
 *              blockHandlerClass：指定调用异常时的处理类
 *              blockHandler：指定调用发生异常时的处理方法，该方法是blockHandlerClass类中的静态方法
 *                          该方法的返回值和参数和ClientHttpRequestInterceptor接口一样（参数还多了BlockException）
 *
 * @Author myf
 * @CreateDate 2022/9/8 17:21
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RestemplateSentinelDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(RestemplateSentinelDemoApp.class,args);
    }
    @Bean
    @SentinelRestTemplate(blockHandler = "handleException",blockHandlerClass = RestTemplateExcUtil.class
                            ,fallback = "handleException",fallbackClass = RestTemplateExcUtil.class)
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
