package cn.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : @RefreshScope 添加后配置属性变更后会及时变更，无需重启服务
 * @Author myf
 * @CreateDate 2022/9/7 16:24
 * @Version 1.0
 **/
@RestController
@RefreshScope
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${desc:there is no desc}")
    private String desc;

    @Value("${commonUrl}")
    private String commonUrl;

    @RequestMapping("/hi")
    public String hi(){
        return name+":"+desc+"-url:"+commonUrl;
    }
}
