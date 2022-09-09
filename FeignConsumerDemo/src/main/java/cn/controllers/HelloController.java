package cn.controllers;

import cn.interfaces.NacosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/7 10:15
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private NacosClient nacosClient;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hi")
    public String hi(){
        return applicationName+"-"+serverPort+":"+nacosClient.callHiFromNacosClient();
    }
}
