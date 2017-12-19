package com.topscore.omnichannel.order;

import com.topscore.omnichannel.order.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper {

//    @Select("select * from goods where id = #{id}")
    Goods findOne(@Param("id") String id);
}
