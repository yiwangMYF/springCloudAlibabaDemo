package cn.controllers;

import cn.interfaces.NacosClient;
import cn.interfaces.NacosConfig;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/8 14:46
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private NacosClient nacosClient;

    @Autowired
    private NacosConfig nacosConfig;

    @RequestMapping("/hi")
    @SentinelResource(value = "hi")
    public String hi(){
        return nacosClient.callHiFromNacosClient();
    }

    @RequestMapping("/hi2")
    @SentinelResource(value = "hi2")
    public String hi2(){
        return nacosConfig.getConfig();
    }
}
