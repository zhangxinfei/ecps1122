package cn.itcast.util.exception;

/**
* @ClassName: DaoException 
* @Description: yuanjianhua@bocom.cn
* @author yuanjianhua@bocom.cn
* @date 2016年12月6日 下午5:13:01 
*  
*/  
public class DaoException extends BaseRuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5368690119947299703L;

	public DaoException(int code, String message) {
        super(code, message);
    }

    public DaoException(int code, Throwable throwable) {
        super(code, throwable);
    }
}
