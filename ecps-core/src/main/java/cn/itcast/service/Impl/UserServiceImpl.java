package cn.itcast.service.Impl;

import cn.itcast.enums.WizardAuditEnum;
import cn.itcast.mapper.UserMapper;
import cn.itcast.model.User;
import cn.itcast.model.params.UserParams;
import cn.itcast.model.result.ResultModel;
import cn.itcast.service.UserService;
import cn.itcast.util.LogUtils;
import cn.itcast.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    //    日志
    final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public ResultModel selectByKeyAndPassword(HttpServletRequest request, UserParams user) {
//        初始化序列化结果集
        ResultModel result = ResultUtil.info(WizardAuditEnum.StatusEnum.STATUS_FAIL.getValue(),WizardAuditEnum.StatusEnum.STATUS_FAIL.getDesc());
//        查询数据库，返回值为0的化就是没有登录失败，为1的化就是成功
        int influence = userMapper.selectByKeyAndPassword(user);
        if(influence == 1){
            result = ResultUtil.success(WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getValue(),WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getDesc());
            logger.info("登录成功->success");
        }
        return result;
    }
}
