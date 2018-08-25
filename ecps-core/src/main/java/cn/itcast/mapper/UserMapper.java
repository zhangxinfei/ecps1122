package cn.itcast.mapper;

import cn.itcast.model.User;
import cn.itcast.model.params.UserParams;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
//  登录的判断
    Boolean selectByUserParams(UserParams userParams);
}