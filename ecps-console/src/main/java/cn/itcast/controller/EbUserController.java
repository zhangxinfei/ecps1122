package cn.itcast.controller;

import cn.itcast.model.User;
import cn.itcast.service.EbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class EbUserController {
    @Autowired
    EbUserService ebUserService;

    @RequestMapping("/login")
    public String login() {
        return "/ceshi1.jsp";
    }

    //添加用户
    @RequestMapping(value = "/insert/{user}", method = RequestMethod.GET)
    public void insert(@PathVariable("user") User user) throws Exception {
        ebUserService.insert(user);
    }

    //通过主键，删除用户
    @RequestMapping(value = "/deleteByPrimaryKey/{user_id}", method = RequestMethod.GET)
    public void deleteByPrimaryKey(@PathVariable("user_id") int user_id) throws Exception {
        ebUserService.deleteByPrimaryKey(user_id);
    }

    //通过主键，修改用户
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    public void updateByPrimaryKey(HttpServletRequest request,String json) throws Exception {
        System.out.print(json);

        //        String userId = (String) request.getAttribute("userId");
//        User user = map.get("user");
//        ebUserService.updateByPrimaryKey(userId,user);
    }

    //通过id，查询用户信息
    @RequestMapping(value = "/selectByPrimaryKey/{userId}", method = RequestMethod.GET)
    public @ResponseBody
    List<User> selectUserById(@PathVariable("userId") int userId) throws Exception {
        List<User> userList = ebUserService.selectByPrimaryKey(userId);
        return userList;
    }


//    测试

    @RequestMapping(value = "/sdktest", method = RequestMethod.POST)
    public @ResponseBody
    String sdktest(@RequestBody String json) {
        System.out.println(json);
        return json;
    }
}
