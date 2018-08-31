package cn.itcast.util.entity;

import java.io.Serializable;

/**
 * Created by wxl on 2018/6/12.
 * 返回数据状态，封装实体类
 */
public class CommonResultEntity implements Serializable {
    private static final long serialVersionUID = -8092903303385153617L;

    private boolean success;

    private Integer code;

    private Object data;

    private String message;

    public CommonResultEntity(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResultEntity() {

        this.success = true;
        this.code = 0;
        this.message = "";
    }

    public CommonResultEntity(Integer resultCode){
        this.code = resultCode;
    }



    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
