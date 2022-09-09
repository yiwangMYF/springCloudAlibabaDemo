package cn.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/7 10:20
 * @Version 1.0
 **/
@FeignClient(value = "nacos-client",fallback = NacosClient.NacosClientFallback.class)
public interface NacosClient {


    @RequestMapping("/hi")
    String callHiFromNacosClient();
    
    /**
    * @Author myf
    * @Description //TODO 接口的降级处理类,实现对应的接口
    * @Date 2022/9/8 16:48
    * @Param 
    * @return 
    */
    class NacosClientFallback implements NacosClient{

        @Override
        public String callHiFromNacosClient() {
            return "sentinel feign call fallback handled";
        }
    }


}
