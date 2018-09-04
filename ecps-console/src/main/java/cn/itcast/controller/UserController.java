package cn.itcast.controller;

import cn.itcast.model.params.UserParams;
import cn.itcast.model.result.ResultModel;
import cn.itcast.service.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

//    日志
    final static Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 用户登录判断
     * @return
     */
    @RequestMapping(value = "/Login",method = RequestMethod.POST)
    @ResponseBody
    public String getLoginStatus(HttpServletRequest request,@RequestBody UserParams userParams){
        logger.info("用户登录->start");
        ResultModel result = userService.selectByKeyAndPassword(request,userParams);
        logger.info("用户登录—>end");
        return JSON.toJSONString(result,SerializerFeature.WriteMapNullValue);
    }

//    /**
//     * 用户登录判断
//     * @return
//     */
//    @RequestMapping(value = "/Login",method = RequestMethod.)
//    @ResponseBody
//    public String getLoginStatus(HttpServletRequest request,@RequestBody UserParams userParams){
//        logger.info("用户登录->start");
//        ResultModel result = userService.selectByKeyAndPassword(request,userParams);
//        logger.info("用户登录—>end");
//        return JSON.toJSONString(result,SerializerFeature.WriteMapNullValue);
//    }
}
