package cn.utils;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @Description；用于restTemplate 调用异常回调
 * @Author myf
 * @CreateDate 2022/9/8 17:27
 * @Version 1.0
 **/
@Slf4j
public class RestTemplateExcUtil {

    public static ClientHttpResponse handleException(HttpRequest var1, byte[] var2, ClientHttpRequestExecution var3, BlockException var4){
        log.error(var1.getURI().getPath());
        log.info("-----------------------------------");
        log.error(var2.toString());
        log.info("-----------------------------------");
        log.error(var3.toString());
        log.info("-----------------------------------");
        log.error(var4.getMessage());

        return new SentinelClientHttpResponse("server call fail,the below exception is handled:"+var4.getMessage());
    }
}
