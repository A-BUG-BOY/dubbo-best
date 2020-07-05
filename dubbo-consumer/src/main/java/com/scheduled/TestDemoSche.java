package com.scheduled;

import com.demoAPI.TestDemo;
import com.mapper.TGoodsDao;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: dubbo-best
 * @description:
 * @author: zxb
 * @create: 2020-07-05 21:42
 **/
@Component
public class TestDemoSche {

    @Reference
    TestDemo testDemo;

    @Reference
    TGoodsDao tGoodsDao;

    //@Scheduled(fixedRate = 1000)
    public void testDemo(){
        System.out.println(testDemo.test("我是消费者"));
    }

    @Scheduled(fixedRate = 1000)
    public void testGoods(){
        int id = 1;
        String name = "iphone";
        int price = 1000;
        tGoodsDao.insertGoods(id,name,price);
        id = id + 1;
        name = name+"-"+1;
        price = price + 100;
    }
}
