package cn.itcast.util;

import cn.itcast.util.entity.SYAuthPerson;
import cn.itcast.util.entity.SYAuthTableType;
import cn.itcast.util.entity.UserSession;
import cn.itcast.util.enums.AuthCommonEnum;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by jh on 2017/6/2.
 */
public class SessionCommonInfoUtils {
    //获取用户信息数据
    public static UserSession getUserInfo(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserSession user = null;
        try{
            user = (UserSession)session.getAttribute("userSession");
            DESUtilsPlus dps = new DESUtilsPlus();
            user.setUserid(dps.decrypt((String)session.getAttribute("userId")));
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    //获取业务精灵菜单表
    public static SYAuthTableType getResourceWizardTab(HttpServletRequest request){
        UserSession user = (UserSession)request.getSession().getAttribute("userSession");
        SYAuthTableType authTable = new SYAuthTableType();
        try{
            List<SYAuthTableType> authList = JSON.parseArray( DesUtils.decrypt(user.getAuthTab()), SYAuthTableType.class);
            Map<String, SYAuthTableType> authTableMap = authList.stream().collect(
                    Collectors.toMap(SYAuthTableType::getTabletype, (p) -> p));
            authTable = authTableMap.get(AuthCommonEnum.WizardTypeTab.USER_AUTH_TAB_RESOURCES.value);
        }catch (Exception e){
            e.printStackTrace();
        }
        return authTable;
    }
    //获取所有table列表数据
    public static List<SYAuthTableType> getUserTabList(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserSession userMode = (UserSession)session.getAttribute("userSession");
        List<SYAuthTableType> authPersonLis = new ArrayList<>();
        try{
            String auth = DesUtils.decrypt(userMode.getAuthTab());
            authPersonLis = JSON.parseArray(auth,SYAuthTableType.class);
        }catch (Exception e){
            e.printStackTrace();
        }


        return authPersonLis;
    }

    //获取资源精灵权限组织数据(查看权限)
    public static SYAuthPerson getResourceWizaidAuthPerson(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserSession user = (UserSession)session.getAttribute("userSession");
        Map<String, SYAuthPerson> authPersonMap = new HashMap<String, SYAuthPerson>();
        try {
            String auth = DesUtils.decrypt(user.getAuth());
            List<SYAuthPerson> authPersonList = JSON.parseArray(auth,SYAuthPerson.class);
            authPersonMap = authPersonList.stream().collect(
                    Collectors.toMap(SYAuthPerson::getAuth, (p) -> p));
        }catch (Exception e){
            e.printStackTrace();
        }
        return authPersonMap.get(AuthCommonEnum.USER_AUTH_VIEW);
    }

    //获取业务精灵权限组织数据(编辑)
    public static SYAuthPerson getBussinessWizaidAuthEditPerson(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserSession user = (UserSession)session.getAttribute("userSession");
        Map<String, SYAuthPerson> authPersonMap = new HashMap<String, SYAuthPerson>();
        try {
            String auth = DesUtils.decrypt(user.getAuth());
            List<SYAuthPerson> authPersonList = JSON.parseArray(auth,SYAuthPerson.class);
            authPersonMap = authPersonList.stream().collect(
                    Collectors.toMap(SYAuthPerson::getAuth, (p) -> p));
        }catch (Exception e){
            e.printStackTrace();
        }
        return authPersonMap.get(AuthCommonEnum.USER_AUTH_EDIT);
    }

    //根据平台获取对应的链接
    public static SYAuthPerson getBussinessWizaidAuthPerson(HttpServletRequest request, String type){
        HttpSession session = request.getSession();
        UserSession user = (UserSession)session.getAttribute("userSession");
        Map<String, SYAuthPerson> authPersonMap = new HashMap<String, SYAuthPerson>();
        try {
            String auth = DesUtils.decrypt(user.getAuth());
            List<SYAuthPerson> authPersonList = JSON.parseArray(auth,SYAuthPerson.class);
            authPersonMap = authPersonList.stream().collect(
                    Collectors.toMap(SYAuthPerson::getAuth, (p) -> p));
        }catch (Exception e){
            e.printStackTrace();
        }
        SYAuthPerson  authPerson = authPersonMap.get(type);
        authPerson.setUserName(user.getUserName());
        return authPerson;
    }

    //获取用户的userId
    public static String getUserId(HttpServletRequest request){
        String userId = "";
        try {
            userId = (String)request.getSession().getAttribute("userId");
        }catch (Exception e){
            e.printStackTrace();
        }
        return userId;
    }


    //获取业务精灵权限组织数据(查看权限)
    public static SYAuthPerson getBussinessWizaidAuthPerson(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserSession user = (UserSession)session.getAttribute("userSession");
        Map<String, SYAuthPerson> authPersonMap = new HashMap<String, SYAuthPerson>();
        try {
            String auth = DesUtils.decrypt(user.getAuth());
            List<SYAuthPerson> authPersonList = JSON.parseArray(auth,SYAuthPerson.class);
            authPersonMap = authPersonList.stream().collect(
                    Collectors.toMap(SYAuthPerson::getAuth, (p) -> p));
        }catch (Exception e){
            e.printStackTrace();
        }
        return authPersonMap.get(AuthCommonEnum.USER_AUTH_VIEW);
    }

    //获取业务精灵菜单表
    public static SYAuthTableType getBusinessWizardTab(HttpServletRequest request){
        UserSession user = (UserSession)request.getSession().getAttribute("userSession");
        SYAuthTableType authTable = new SYAuthTableType();
        try{
            List<SYAuthTableType> authList = JSON.parseArray( DesUtils.decrypt(user.getAuthTab()), SYAuthTableType.class);
            Map<String, SYAuthTableType> authTableMap = authList.stream().collect(
                    Collectors.toMap(SYAuthTableType::getTabletype, (p) -> p));
            authTable = authTableMap.get(AuthCommonEnum.WizardTypeTab.USER_AUTH_TAB_BUSINESS.value);
        }catch (Exception e){
            e.printStackTrace();
        }
        return authTable;
    }

    /**
     * 根据平台类型获取对应的按钮信息
     * @param request
     * @param type
     * @return
     */
    public static SYAuthTableType getWizardTabByType(HttpServletRequest request, String type){
        UserSession user = (UserSession)request.getSession().getAttribute("userSession");
        SYAuthTableType authTable = new SYAuthTableType();
        try{
            List<SYAuthTableType> authList = JSON.parseArray( DesUtils.decrypt(user.getAuthTab()), SYAuthTableType.class);
            Map<String, SYAuthTableType> authTableMap = authList.stream().collect(
                    Collectors.toMap(SYAuthTableType::getTabletype, (p) -> p));
            authTable = authTableMap.get(type);
        }catch (Exception e){
            e.printStackTrace();
        }
        return authTable;
    }
}
