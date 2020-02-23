package com.ycj.dubboDemo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ycj.dubboDemo.common.service.DemoService;

/**
 * @Author: yanchengjie
 */
@Service
public class ProviderService implements DemoService {

    @Override
    public String getDemoString() {
        return "ProviderService";
    }
}
