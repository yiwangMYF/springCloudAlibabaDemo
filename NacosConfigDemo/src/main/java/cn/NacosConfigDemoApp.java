package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description :测试nacos配置管理
 *               1.添加nacos-config的依赖
 *               2.在资源类路径下添加bootstrap.properties文件
 *                  spring.application.name=nacos-config
 *                  #nacos服务地址#
                    spring.cloud.nacos.config.server-addr=127.0.0.1:8848
                    nacos中服务的配置的dataI的如下：
                    dataId:${prefix}-${spring.profiles.active}.${file-extension}
                            1):prefix默认值为spring.application.name的值(
                        注：在bootstrap.properties与application.yml中的值要保持一致，或者不配置，因为
                            bootstrap.properties会先于application.yml文件加载，所以会被application.yml的值覆盖);
                            2):spring.profiles.active不存在时省略前面的‘-’，注：(${spring.profiles.active} 当通过配置文件来指定时必须放在 bootstrap.properties 文件中);
                            3):file-extension为文件类型，目前支持properties和yaml,
                            通过spring.cloud.nacos.config.file-extension

                        #------------------------------------------------------------------------------
                        #nacos会同时去加载${spring.application.name}-${spring.profiles.active}.${file-extension}配置文件、${spring.application.name}.${file-extension}
                        #以及配置的extension-configs和shared-configs配置文件
                        #多个配置文件中有相同的属性时，优先级如下：
                        #${spring.application.name}-${spring.profiles.active}.${file-extension}>${spring.application.name}.${file-extension}>extension-configs>shared-configs
                 3.在配置类上添加@RefreshScope,可以动态刷新配置类




 * @Author myf
 * @CreateDate 2022/9/7 16:10
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigDemoApp.class,args);
    }
}
