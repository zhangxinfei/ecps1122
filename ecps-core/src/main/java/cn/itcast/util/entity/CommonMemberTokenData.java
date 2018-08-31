package cn.itcast.util.entity;

import java.io.Serializable;

/**
 * Created by wxl on 2018/6/19.
 */
public class CommonMemberTokenData implements Serializable {
    private static final long serialVersionUID = 2724888087391664167L;

    private String member_code;//用户编码
    private String member_name;//用户名称
    private String industrial_group_code;//产业集团编码
    private String authPage;//权限页面集合
    private String authArea;//权限地区集合
    private String authPartition;//城市集合
    private String industrialGroupCode;//产业集团集合

    private String authPageEdit;//权限页面集合
    private String authAreaEdit;//权限地区集合
    private String authPartitionEdit;//城市集合
    private String industrialGroupCodeEdit;//产业集团集合

    public String getAuthPageEdit() {
        return authPageEdit;
    }

    public void setAuthPageEdit(String authPageEdit) {
        this.authPageEdit = authPageEdit;
    }

    public String getAuthAreaEdit() {
        return authAreaEdit;
    }

    public void setAuthAreaEdit(String authAreaEdit) {
        this.authAreaEdit = authAreaEdit;
    }

    public String getAuthPartitionEdit() {
        return authPartitionEdit;
    }

    public void setAuthPartitionEdit(String authPartitionEdit) {
        this.authPartitionEdit = authPartitionEdit;
    }

    public String getIndustrialGroupCodeEdit() {
        return industrialGroupCodeEdit;
    }

    public void setIndustrialGroupCodeEdit(String industrialGroupCodeEdit) {
        this.industrialGroupCodeEdit = industrialGroupCodeEdit;
    }

    public String getIndustrialGroupCode() {
        return industrialGroupCode;
    }

    public void setIndustrialGroupCode(String industrialGroupCode) {
        this.industrialGroupCode = industrialGroupCode;
    }

    public String getAuthPage() {
        return authPage;
    }

    public void setAuthPage(String authPage) {
        this.authPage = authPage;
    }

    public String getAuthArea() {
        return authArea;
    }

    public void setAuthArea(String authArea) {
        this.authArea = authArea;
    }

    public String getAuthPartition() {
        return authPartition;
    }

    public void setAuthPartition(String authPartition) {
        this.authPartition = authPartition;
    }

    public String getMember_code() {
        return member_code;
    }

    public void setMember_code(String member_code) {
        this.member_code = member_code;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getIndustrial_group_code() {
        return industrial_group_code;
    }

    public void setIndustrial_group_code(String industrial_group_code) {
        this.industrial_group_code = industrial_group_code;
    }
}
