package cn.itcast.util.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;


/** 
* @ClassName: AbstractEntity 
* @Description: 所有实体类从这里继承
* @author yuanjianhua@bocom.cn
* @date 2016年12月6日 下午3:24:28 
*  
*/  
public class AbstractEntity implements BaseEntity<AbstractEntity>,Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2738916063118356014L;

	@Override
    public String asJson() {
        GsonBuilder gb = new GsonBuilder();
        gb.disableHtmlEscaping();
        Gson gson = gb.create();
        return gson.toJson(this);
    }

    @Override
    public AbstractEntity build() {
        return this;
    }
}
