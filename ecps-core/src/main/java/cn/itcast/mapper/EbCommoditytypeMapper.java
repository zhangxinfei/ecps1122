package cn.itcast.mapper;

import cn.itcast.model.Commoditytype;

public interface EbCommoditytypeMapper {
    int deleteByPrimaryKey(String commodityType);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);
}