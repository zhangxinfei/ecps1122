package cn.itcast.service.impl;

import cn.itcast.model.Administrators;
import cn.itcast.model.User;
import cn.itcast.service.EbAdministratorsService;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class EbAdministratorsServiceImpl implements EbAdministratorsService {

    public List<Administrators> selectByPrimaryKey(int administrators_id) throws Exception {
        return null;
    }

    public void insert(Administrators administrators) throws Exception {

    }

    @Override
    public List<User> selectUserById(int user_id) throws Exception {
        return null;
    }

    @Override
    public void insert(User user) throws Exception {

    }

    public void deleteByPrimaryKey(int administrators_id) throws Exception {

    }

    @Override
    public void updateByPrimaryKey(User user) throws Exception {

    }

    public void updateByPrimaryKey(Administrators administrators) throws Exception {

    }
}
