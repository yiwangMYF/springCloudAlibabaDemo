package cn.controllers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/8 17:47
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    @SentinelResource(value = "resttemplateSentinelDemo-hi")
    public String hi(){
        return restTemplate.getForObject("http://nacos-config-client/hi",String.class);
    }
}
