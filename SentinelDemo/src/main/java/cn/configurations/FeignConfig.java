package cn.configurations;

import cn.interfaces.NacosClient;
import cn.interfaces.NacosConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description ： 将各个接口的fallback实现类放入spring容器
 * @Author myf
 * @CreateDate 2022/9/8 16:54
 * @Version 1.0
 **/
@Configuration
public class FeignConfig {
    
    /**
    * @Author myf
    * @Description //TODO NacosClientFallback的实例
    * @Date 2022/9/8 16:55
    * @Param []
    * @return cn.interfaces.NacosClient.NacosClientFallback
    */
    @Bean
    public NacosClient.NacosClientFallback nacosClientFallback(){
        return new NacosClient.NacosClientFallback();

    }
    /**
    * @Author myf
    * @Description //TODO NacosConfigFallBack的实例
    * @Date 2022/9/8 17:19
    * @Param []
    * @return cn.interfaces.NacosConfig.NacosConfigFallBack
    */
    @Bean
    public NacosConfig.NacosConfigFallBack nacosConfigFallBack(){
        return new NacosConfig.NacosConfigFallBack();
    }
}
