package cn.itcast.model.result;

import java.io.Serializable;
/**
 * 返回数据状态，封装实体类
 */
public class ResultModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;

    private Integer code;

    private Object data;

    private String message;

    public ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultModel() {

        this.success = true;
        this.code = 0;
        this.message = "";
    }

    public ResultModel(Integer resultCode){
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
