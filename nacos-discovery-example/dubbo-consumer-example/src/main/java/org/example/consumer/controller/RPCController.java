package org.example.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.example.provider.ApiProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPCController {
    @Reference
    private ApiProviderService apiProviderService;

    @GetMapping("/rpc")
    public String rpc() {
        String s = apiProviderService.sayHi();
        return s;
    }

}
