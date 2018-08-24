package cn.itcast.service.impl;

import cn.itcast.dao.EbAdministratorsDao;
import cn.itcast.model.Administrators;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class EbAdministratorsServiceImpl extends SqlSessionDaoSupport implements EbAdministratorsDao {

    public List<Administrators> selectByPrimaryKey(int administrators_id) throws Exception {
        return null;
    }

    public void insert(Administrators administrators) throws Exception {

    }

    public void deleteByPrimaryKey(int administrators_id) throws Exception {

    }

    public void updateByPrimaryKey(Administrators administrators) throws Exception {

    }
}
