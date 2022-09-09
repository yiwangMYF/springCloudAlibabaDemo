package cn.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/6 17:11
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hi")
    public String hi(){
        return "hello,"+applicationName+";server port:"+serverPort;
    }
}
