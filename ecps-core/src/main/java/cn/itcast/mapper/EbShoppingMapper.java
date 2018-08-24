package cn.itcast.mapper;

import cn.itcast.model.Shopping;

public interface EbShoppingMapper {
    int deleteByPrimaryKey(Integer buyId);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    Shopping selectByPrimaryKey(Integer buyId);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);
}