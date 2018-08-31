package cn.itcast.util.exception;


/** 
* @ClassName: BaseRuntimeException 
* @Description: 所有业务各类运行时异常从这里继承
* @author yuanjianhua@bocom.cn
* @date 2016年12月6日 下午5:13:45 
*  
*/  
public class BaseRuntimeException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4944567373154373907L;
	private final int code;
    
    public BaseRuntimeException(int code,String message) {
        super(message);
        this.code = code;
    }

    public BaseRuntimeException(int code,Throwable cause) {
        super(cause);
        this.code = code;
    }

    public BaseRuntimeException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
