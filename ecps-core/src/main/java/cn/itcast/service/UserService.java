package cn.itcast.service;

import cn.itcast.model.User;
import cn.itcast.model.params.UserParams;
import cn.itcast.model.result.ResultModel;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    /**
     *根据ID和密码查询，登录
     * @Parms request
     * @params userParams
     *
    */
    ResultModel selectByKeyAndPassword(HttpServletRequest request, UserParams userp);

    /**
     *注册
     * @Parms request
     * @parms userParams
     *
     */
    ResultModel insertByUser(HttpServletRequest request, UserParams userParams);



}
