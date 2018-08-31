package cn.itcast.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerUtils {
	private static final Log logger = LogFactory.getLog(LoggerUtils.class);
	
	public static void error(Log logger, Exception ex){
		logger.error(ex.getMessage(), ex);
		ex.printStackTrace();
	}
	
	public static void error(Exception ex){
		error(logger,ex);
	}
	
	public static void error(String msg, Exception ex){
		error(logger,new Exception(msg,ex));
	}
	
	public static void error(Object obj){
		logger.error(obj);
	}
	
	public static void info(Object obj){
		logger.info(obj);
	}
	
	public static void warn(Object obj){
		logger.warn(obj);
	}
	
	public static void debug(Object obj){
		logger.debug(obj);
	}
	
}
