package cn.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/6 17:20
 * @Version 1.0
 **/
@RestController
public class HiController {

    @Autowired
    RestTemplate restTemplate;
    /**
    * @Author myf
    * @Description //TODO 使用restTemplate 调用远程服务
     *                      @HystrixCommand 注解用于给指定方法启用熔断器功能
     *                      fallbackMethod指定服务降级方法，该方法必须要与启用熔断器的方法在同一个类上
    * @Date 2022/9/7 9:35
    * @Param []
    * @return java.lang.String
    */
    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "responseError")
    public String hi(){
        return restTemplate.getForObject("http://nacos-client/hi",String.class);
    }


    public String responseError(){
        return "不好，暂时无法提供服务";
    }
}
