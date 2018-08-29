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

    /*
     * 通过id和密码判断用户登录
     */
    int selectByKeyAndPassword(UserParams user);
}