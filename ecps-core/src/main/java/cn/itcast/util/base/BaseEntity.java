package cn.itcast.util.base;

import java.io.Serializable;


/**
* @ClassName: BaseEntity 
* @Description: 基础实体接口
* @author yuanjianhua@bocom.cn
* @date 2016年12月6日 下午3:23:59 
* 
* @param <T> 
*/  
public interface BaseEntity<T> extends Serializable {
    String asJson();
    T build();
}
