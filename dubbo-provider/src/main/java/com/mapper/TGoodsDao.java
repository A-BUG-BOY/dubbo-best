package com.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface TGoodsDao {

    @Insert("insert into t_goods(goods_id,goods_name,good_price) values(#{goods_id},#{good_name},#{good_price})")
    int insertGoods(@Param("goods_id")int goodsId,@Param("good_name")String goodName,@Param("good_price") int goodPrice);
}
