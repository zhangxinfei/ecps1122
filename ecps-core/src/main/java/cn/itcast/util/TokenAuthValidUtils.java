package cn.itcast.util;

import cn.itcast.util.auth.AuthRoleValidate;
import cn.itcast.util.entity.CommonMemberTokenData;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by wxl on 2018/7/28.
 */
public class TokenAuthValidUtils {

    /**
     * 校验编辑权限
     * @param token
     * @param authRole
     * @return
     */
    public static boolean validAuthEDIT(CommonMemberTokenData token,AuthRoleValidate authRole,HttpServletRequest request){
        Map<String,String[]> pramMap = request.getParameterMap();
        if(token.getAuthPage().contains(authRole.value().getAuthCode())){
            Boolean re = validDimension( token, authRole, request);
            return re;
        }
        return false;
    }

    /**
     *
     * 校验查看权限
     * @param token
     * @param authRole
     * @return
     */
    public static boolean validAuthVIEW(CommonMemberTokenData token,AuthRoleValidate authRole,HttpServletRequest request){
        Map<String,String[]> pramMap = request.getParameterMap();
        if(token.getAuthPageEdit().contains(authRole.value().getAuthCode())){
            Boolean re = validDimension( token, authRole, request);
            return re;
        }
        return false;
    }

    /**
     * 返回前端数据
     * @param response
     * @param res
     * @throws Exception
     */
    public static void printMessage(HttpServletResponse response, Object res) throws Exception {
                 PrintWriter writer = null;
                 response.setCharacterEncoding("UTF-8");
                 response.setContentType("text/html; charset=utf-8");
                 try {
                         writer = response.getWriter();
                         writer.print(JSONObject.toJSONString(res, SerializerFeature.WriteMapNullValue));
                         //writer.print(JsonUtil.toJson(res));
                     } catch (Exception e) {
                         e.printStackTrace();
                     } finally {
                         if (writer != null){
                                 writer.close();
                             }
                     }
             }

    public static boolean validDimension(CommonMemberTokenData token,AuthRoleValidate authRole,HttpServletRequest request){
        String EditOrView = (authRole.value().getAuth()).trim();
        Boolean result = false;
        if(EditOrView.equals("EDIT")){
            result = validDimension(token.getIndustrialGroupCodeEdit(),token.getAuthAreaEdit(),token.getAuthPartitionEdit(), authRole, result, request);
        }else if(EditOrView.equals("VIEW")){
            result = validDimension(token.getIndustrialGroupCode(),token.getAuthArea(),token.getAuthPartition(), authRole, result, request);
        }
        return result;
    }

    public static boolean validDimension(String industrialgroupcodeedit, String authAreaEdit, String authPartitionEdit, AuthRoleValidate authRole, Boolean result, HttpServletRequest request){
        String params = authRole.value().getAuthParams();
        String industrial_group_code=  request.getParameter("industrial_group_code");
        String area_code=  request.getParameter("area_code");
        authAreaEdit = (StringUtils.isNotBlank(industrialgroupcodeedit)?"ALL,":"")+authAreaEdit;
        authPartitionEdit = (StringUtils.isNotBlank(authAreaEdit)?"ALL,EMPTY,":"")+authAreaEdit;
        String partition_code =  request.getParameter("partition_code");
        if(params.contains("INDUSTRIAL") && !params.contains("AREA")  && !params.contains("PARTITION")){
            result = (industrialgroupcodeedit.contains(industrial_group_code) || industrialgroupcodeedit.contains("ALL"));
        }else if(params.contains("INDUSTRIAL") && params.contains("AREA") && !params.contains("PARTITION")){
            result = ((industrialgroupcodeedit.contains(industrial_group_code)|| industrialgroupcodeedit.contains("ALL")) && (authAreaEdit.contains(area_code) || authAreaEdit.contains("ALL")));
        }else if(params.contains("INDUSTRIAL") && params.contains("AREA") && params.contains("PARTITION")){
            result = ((industrialgroupcodeedit.contains(industrial_group_code) || industrialgroupcodeedit.contains("ALL")) && (authAreaEdit.contains(area_code) || authAreaEdit.contains("ALL")) && (authPartitionEdit.contains(partition_code) ||authPartitionEdit.contains("EMPTY") ||authPartitionEdit.contains("ALL") ));
        }else{
            result = false;
        }
        return result;
    }
}
