package cn.itcast.util;

import cn.itcast.util.entity.ResultInfo;
import org.omg.CORBA.Object;

/**
 * Created by wxl on 2017/12/29.
 * 返回数据集合整理工具
 */
public class ResultInfoUtils {

    /**
     * 成功信息
     */
    public static ResultInfo resultUtils(ResultInfo resultInfo, int code, Object data, String message, boolean success){
        resultInfo.setCode(code);
        resultInfo.setData(data);
        resultInfo.setMessage(message);
        resultInfo.setSuccess(success);
        return resultInfo;
    }


}
