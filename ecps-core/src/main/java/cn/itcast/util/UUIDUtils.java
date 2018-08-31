package cn.itcast.util;

import cn.itcast.util.enums.CommonInfoEnum;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by wxl on 2018/7/30.
 */
public class UUIDUtils {

    /**
     * 获取uuid
     * @param code
     * @return
     */
    public static String getUUID(String code) {
        String time = (new SimpleDateFormat("MMddHHmmss")).format(new Date());
        String uuid = CommonInfoEnum.UUIDType.getDesc(code)+ UUID.randomUUID().toString().replace("-", "").toLowerCase()+time;
        return uuid;
    }

}
