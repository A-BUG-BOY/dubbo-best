package com.mapper;

import com.entity.TGoodsDetails;
import com.entity.TGoodsDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TGoodsDetailsMapper {
    int countByExample(TGoodsDetailsExample example);

    int deleteByExample(TGoodsDetailsExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(TGoodsDetails record);

    int insertSelective(TGoodsDetails record);

    List<TGoodsDetails> selectByExample(TGoodsDetailsExample example);

    TGoodsDetails selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") TGoodsDetails record, @Param("example") TGoodsDetailsExample example);

    int updateByExample(@Param("record") TGoodsDetails record, @Param("example") TGoodsDetailsExample example);

    int updateByPrimaryKeySelective(TGoodsDetails record);

    int updateByPrimaryKey(TGoodsDetails record);
}
