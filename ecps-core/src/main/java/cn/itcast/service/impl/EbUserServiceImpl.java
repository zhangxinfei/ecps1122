package cn.itcast.service.impl;

import cn.itcast.mapper.EbUserMapper;
import cn.itcast.model.User;
import cn.itcast.service.EbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EbUserServiceImpl implements EbUserService {
    @Autowired
    EbUserMapper userMapper;

    public List<User> selectByPrimaryKey(int userId) throws Exception {
        return userMapper.selectByPrimaryKey(userId);
    }

    public void insert(User user) throws Exception {
        userMapper.insert(user);
    }

    public void deleteByPrimaryKey(int user_id) throws Exception {
        userMapper.deleteByPrimaryKey(user_id);
    }

    public void updateByPrimaryKey(Object userId, User user) throws Exception {
//        String user_id=String.valueOf(userId);
        if(userId != null ){
            userMapper.updateByPrimaryKey(user);
        }
    }

    public int insertSelective(User record) {
        return 0;
    }

    public User selectByPrimaryKey(Integer userId) {
        return null;
    }

    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

}
