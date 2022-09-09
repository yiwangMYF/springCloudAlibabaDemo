import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description ：
 *              @EnableDiscoveryClient 开启服务发现与注册
 * @Author myf
 * @CreateDate 2022/9/6 15:26
 * @Version 1.0
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("cn.*")
@EnableDiscoveryClient
public class NacosClientDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientDemoApp.class,args);
    }
}
