package cn.interfaces;

import cn.configurations.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/7 10:20
 * @Version 1.0
 **/
@FeignClient(value = "nacos-client",configuration = {FeignConfig.class})
public interface NacosClient {


    @RequestMapping("/hi")
    String callHiFromNacosClient();


}
