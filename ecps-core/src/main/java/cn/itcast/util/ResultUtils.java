package cn.itcast.util;

import cn.itcast.util.entity.CommonResultEntity;

/**
 * Created by wxl on 2018/6/13.
 */
public class ResultUtils {
    public static CommonResultEntity error(Integer code, String desc){
        return  createData(code,desc,false);
    }
    public static CommonResultEntity info(Integer code, String desc){
        return  createData(code,desc,false);
    }
    public static CommonResultEntity success(Integer code, String desc){
        return createData(code,desc,true);
    }
    private static CommonResultEntity createData(Integer code, String desc, boolean isTrue){
        CommonResultEntity result = new CommonResultEntity();
        result.setCode(code);
        result.setMessage(desc);
        result.setSuccess(isTrue);
        result.setData("");
        return  result;
    }
}
