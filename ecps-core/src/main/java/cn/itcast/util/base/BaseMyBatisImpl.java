package cn.itcast.util.base;

import cn.itcast.util.exception.DaoException;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BaseMyBatisImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseMyBatisImpl.class);
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    public <T> T selectOne(Class<T> type, String sql, Object params) throws DaoException {
        SqlSession session = sqlSessionFactory.openSession();
        T dto;
        try {
            if (params == null) {
                dto = session.selectOne(sql);
            } else {
                dto = session.selectOne(sql, params);
            }
        } catch (Exception e) {
            throw new DaoException(0x00000021, e);
        } finally {
            session.close();
        }
        if (dto instanceof AbstractEntity) {
            LOGGER.debug("seletOne DTO '{}'", ((AbstractEntity) dto).asJson());
        } else {
            LOGGER.debug("seletOne DTO '{}'", dto);
        }

        return dto;
    }

    public <T> T selectById(Class<T> type, String sql, String id) {
        return selectOne(type,sql + ".selectById",id);
    }

    public <T> List<T> selectList(Class<T> type, String sql, Object params) {
        SqlSession session = sqlSessionFactory.openSession();
        List<T> dtos = null;
        try {
            if (params == null) {
                dtos = session.selectList(sql);
            } else {
                dtos = session.selectList(sql, params);
            }
        } catch (Exception e) {
            throw new DaoException(0x00000021, e);
        } finally {
            session.close();
        }
        if (dtos != null && !dtos.isEmpty()) {
            for (T dto : dtos) {
                if (dto instanceof AbstractEntity) {
                    LOGGER.debug("seletList DTO '{}'", ((AbstractEntity) dto).asJson());
                } else {
                    LOGGER.debug("seletList DTO '{}'", dto);
                }
            }
        }
        return dtos;
    }

    public <T> List<T> selectPageList(Class<T> type, String sql, Object params, int pageNumber, int pageSize) {
        SqlSession session = sqlSessionFactory.openSession();
        List<T> dtos = null;
        try {
            if (params == null) {
                dtos = session.selectList(sql);
            } else {
                dtos = session.selectList(sql, params,new RowBounds(pageNumber,pageSize));
            }
        } catch (Exception e) {
            throw new DaoException(0x00000021, e);
        } finally {
            session.close();
        }
        if (dtos != null && !dtos.isEmpty()) {
            for (T dto : dtos) {
                if (dto instanceof AbstractEntity) {
                    LOGGER.debug("seletList DTO '{}'", ((AbstractEntity) dto).asJson());
                } else {
                    LOGGER.debug("seletList DTO '{}'", dto);
                }
            }
        }
        return dtos;
    }

    public int insert(String sql, Object params) throws DaoException {
    	SqlSession session = sqlSessionFactory.openSession();
        try {
            int result = session.insert(sql, params);
            session.commit();
            return result;
        } catch (Exception e) {
            throw new DaoException(0x00000021, e);
        }finally{
        	session.close();
        }
    }

    public int update(String sql, Object params) throws DaoException {
    	SqlSession session = sqlSessionFactory.openSession();
        try {
            int result = session.update(sql, params);
            session.commit();
            return result;
        } catch (Exception e) {
            throw new DaoException(0x00000021, e);
        }finally{
        	session.close();
        }
        
    }

    public int delete(String sql, Object params) throws DaoException {
    	SqlSession session = sqlSessionFactory.openSession();
        try {
            int result = session.update(sql, params);
            session.commit();
            return result;
        } catch (Exception e) {
            throw new DaoException(0x00000021, e);
        }finally{
        	session.close();
        }
    }
    
   
}
