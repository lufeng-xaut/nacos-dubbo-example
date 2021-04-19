package org.example.provider.provider;

import org.apache.dubbo.config.annotation.Service;
import org.example.provider.ApiProviderService;

@Service
public class ApiProviderServiceImpl implements ApiProviderService {
    @Override
    public String sayHi() {
        return "hello dubbo!";
    }
}
