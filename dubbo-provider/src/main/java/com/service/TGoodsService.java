package com.service;

import com.mapper.TGoodsDao;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: dubbo-best
 * @description:
 * @author: zxb
 * @create: 2020-07-06 02:11
 **/
@Service
public class TGoodsService {
    @Autowired
    TGoodsDao tGoodsDao;

    public int insertIntoTGoods(int id,String name,int price){
        int i = tGoodsDao.insertGoods(id, name, price);
        return i;
    }
}
