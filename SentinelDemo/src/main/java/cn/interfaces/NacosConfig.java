package cn.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author myf
 * @CreateDate 2022/9/8 17:04
 * @Version 1.0
 **/
@FeignClient(value = "nacos-config-client",fallback = NacosConfig.NacosConfigFallBack.class)
public interface NacosConfig {
    
    @RequestMapping("/hi")
    String getConfig();
    
    /**
    * @Author myf
    * @Description //TODO NacosConfig 用于快速失败的实现类
    * @Date 2022/9/8 17:07
    * @Param 
    * @return 
    */
    class NacosConfigFallBack implements NacosConfig{

        @Override
        public String getConfig() {
            return "糟了，获取配置失败了";
        }
    }
}
