package cn.itcast.mapper;

import cn.itcast.model.Commoditytype;

public interface CommoditytypeMapper {
    int deleteByPrimaryKey(Integer commoditytypeId);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    Commoditytype selectByPrimaryKey(Integer commoditytypeId);

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);
}