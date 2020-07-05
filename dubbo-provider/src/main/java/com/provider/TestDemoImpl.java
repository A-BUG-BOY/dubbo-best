package com.provider;

import com.demoAPI.TestDemo;
import org.apache.dubbo.config.annotation.Service;

/**
 * @program: dubbo-best
 * @description:
 * @author: zxb
 * @create: 2020-07-05 21:13
 **/
@Service
public class TestDemoImpl implements TestDemo {
    @Override
    public String test(String word) {
        return  word;
    }
}
