package cn.itcast.service;

import cn.itcast.model.User;
import cn.itcast.model.params.UserParams;
import cn.itcast.model.result.ResultModel;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    /**
     *根据主键查询用户
     * @Parms request
    */
    ResultModel selectByKeyAndPassword(HttpServletRequest request, UserParams user);
}
