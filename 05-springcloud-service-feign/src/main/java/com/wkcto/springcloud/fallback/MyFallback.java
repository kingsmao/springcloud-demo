package com.wkcto.springcloud.fallback;

import com.wkcto.springcloud.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class MyFallback implements HelloService {

    @Override
    public String hello() {
        return "远程服务不可用，暂时采用本地逻辑代替.......";
    }
}
