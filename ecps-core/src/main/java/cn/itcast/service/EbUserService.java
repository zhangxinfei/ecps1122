package cn.itcast.service;

import cn.itcast.model.User;

import java.util.List;

public interface EbUserService {
    //通过id查询用户信息，返回list集合
    public List<User> selectByPrimaryKey(int userId)throws Exception;
    //增加用户信息
    public void insert(User user)throws Exception;
    //通过id，删除用户信息
    public void deleteByPrimaryKey(int user_id)throws Exception;
    //通过主键，修改用户信息
    public void updateByPrimaryKey(Object uer_id, User user)throws Exception;

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);


}
