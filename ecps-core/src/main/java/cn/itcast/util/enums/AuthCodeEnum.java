package cn.itcast.util.enums;

/**
 * Created by wxl on 2018/7/28.
 * 权限编码
 */
public enum AuthCodeEnum {
     AUTH_DEFAULT("00000", "00000", "允许访问"),

     /******************预算管理***************************/
     SY_BUDGET_BDPLAN_0000001("VIEW", "PAGE_0401010000", "BD", "SEE","INDUSTRIAL,AREA,PARTITION"),//预算编制_查看
     SY_BUDGET_BDPLAN_0000002("EDIT", "PAGE_0401010000", "BD", "SAVE","INDUSTRIAL,AREA,PARTITION"),//预算编制_编辑
     SY_BUDGET_BDPLAN_0000003("VIEW", "PAGE_0401010000", "BD", "DOWN","INDUSTRIAL,AREA,PARTITION"),//预算编制_下载
     SY_BUDGET_BDPLAN_0000004("EDIT", "PAGE_0401010000", "BD", "UPLOAD","INDUSTRIAL,AREA,PARTITION"),//预算编制_上传
     SY_BUDGET_REPORT_0000001("EDIT", "PAGE_0402000000", "BD", "REPORT","INDUSTRIAL,AREA"),//指标审核_上报

     SY_BUDGET_INVEST_0000001("VIEW", "PAGE_0401020000", "BD", "SEE","INDUSTRIAL,AREA,PARTITION"),//投资预算_查看
     SY_BUDGET_INVEST_0000002("EDIT", "PAGE_0401020000", "BD", "SAVE","INDUSTRIAL,AREA,PARTITION"),//投资预算_保存
     SY_BUDGET_INVEST_0000003("EDIT", "PAGE_0401020000", "BD", "UPD","INDUSTRIAL,AREA,PARTITION"),//投资预算_更新
     SY_BUDGET_INVEST_0000004("EDIT", "PAGE_0401020000", "BD", "DEL","INDUSTRIAL,AREA,PARTITION"),//投资预算_删除
    /******************编辑配置***************************/
    SY_CONFIG_REPORT_0000001("EDIT", "PAGE_0302000000", "CONFIG", "REPORT","INDUSTRIAL"),//上报管理_编辑
    SY_CONFIG_REPORT_0000002("EDIT", "PAGE_0302000000", "CONFIG", "TURN_DOWN","INDUSTRIAL"),//上报管理_驳回
    SY_CONFIG_REPORT_0000003("VIEW", "PAGE_0302000000", "CONFIG", "SEE","INDUSTRIAL"),//上报管理_查看

    SY_CONFIG_AUTH_HOLD_0000001("VIEW", "PAGE_0303020000", "CONFIG", "SEE","INDUSTRIAL"),//控股权限管理_查看
    SY_CONFIG_AUTH_HOLD_0000002("EDIT", "PAGE_0303020000", "CONFIG", "SAVE","INDUSTRIAL"),//控股权限管理_保存
    SY_CONFIG_AUTH_HOLD_0000003("EDIT", "PAGE_0303020000", "CONFIG", "DEL","INDUSTRIAL"),//控股权限管理_删除
    SY_CONFIG_AUTH_HOLD_0000004("EDIT", "PAGE_0303020000", "CONFIG", "UPD","INDUSTRIAL"),//控股权限管理_更新
    SY_CONFIG_AUTH_COPM_0000001("VIEW", "PAGE_0303010000", "CONFIG", "SEE","INDUSTRIAL,AREA"),//公司权限管理_查看
    SY_CONFIG_AUTH_COPM_0000002("EDIT", "PAGE_0303010000", "CONFIG", "SAVE","INDUSTRIAL,AREA"),//公司权限管理_保存
    SY_CONFIG_AUTH_COPM_0000003("EDIT", "PAGE_0303010000", "CONFIG", "DEL","INDUSTRIAL,AREA"),//公司权限管理_删除
    SY_CONFIG_AUTH_COPM_0000004("EDIT", "PAGE_0303010000", "CONFIG", "UPD","INDUSTRIAL,AREA"),//公司权限管理_更新

    SY_CONFIG_ORG_COPM_0000001("VIEW", "PAGE_0303030000", "CONFIG", "SEE","INDUSTRIAL"),//组织配置企业_查看
    SY_CONFIG_ORG_COPM_0000002("EDIT", "PAGE_0303030000", "CONFIG", "SAVE","INDUSTRIAL"),//组织配置企业_保存
    SY_CONFIG_ORG_COPM_0000003("EDIT", "PAGE_0303030000", "CONFIG", "DEL","INDUSTRIAL"),//组织配置企业_删除
    SY_CONFIG_ORG_HOLD_0000001("VIEW", "PAGE_0303040000", "CONFIG", "SEE","INDUSTRIAL"),//组织配置控股_查看
    SY_CONFIG_ORG_HOLD_0000002("EDIT", "PAGE_0303040000", "CONFIG", "SAVE","INDUSTRIAL"),//组织配置控股_保存
    SY_CONFIG_ORG_HOLD_0000003("EDIT", "PAGE_0303040000", "CONFIG", "DEL","INDUSTRIAL"),//组织配置控股_删除

    SY_CONFIG_TABLE_0000001("VIEW", "PAGE_0301020000", "CONFIG", "SEE","INDUSTRIAL"),//表单配置_查看
    SY_CONFIG_TABLE_0000002("EDIT", "PAGE_0301020000", "CONFIG", "SAVE","INDUSTRIAL"),//表单配置_保存
    SY_CONFIG_TABLE_0000003("EDIT", "PAGE_0301020000", "CONFIG", "DEL","INDUSTRIAL"),//表单配置_删除
    SY_CONFIG_TABLE_KPI_0000001("VIEW", "PAGE_0301010000", "CONFIG", "SEE","INDUSTRIAL"),//指标配置_查看
    SY_CONFIG_TABLE_KPI_0000002("EDIT", "PAGE_0301010000", "CONFIG", "SAVE","INDUSTRIAL"),//指标配置_保存
    SY_CONFIG_TABLE_KPI_0000003("EDIT", "PAGE_0301010000", "CONFIG", "DEL","INDUSTRIAL"),//指标配置_删除

    SY_CONFIG_CHECK_KPI_0000001("VIEW", "PAGE_0301010000", "CONFIG", "SEE","INDUSTRIAL"),//指标审核_查看
    SY_CONFIG_CHECK_KPI_0000002("EDIT", "PAGE_0301010000", "CONFIG", "SAVE","INDUSTRIAL"),//指标审核_保存
    SY_CONFIG_CHECK_KPI_0000003("EDIT", "PAGE_0301010000", "CONFIG", "DEL","INDUSTRIAL"),//指标审核_删除

    /******************事中管理***************************/
    SY_ASSET_TABLE_DEPRECIATION_ASSETS_0000001("VIEW", "PAGE_0501000000", "CONFIG", "SEE","INDUSTRIAL,AREA");//事中管理_资产折旧

   /* String auth() default "VIEW"; //操作权限;
    String authsCode();//权限代码
    String typeCode();//操作类型 业务精灵 资源精灵 管理平台 运营平台
    String operating();//操作 上报 ，保存 ，删除*/

     /**权限标识 */
     private String auth;//authId

     /**权限编码 */
     private String authCode;

     /**权限名称 */
     private String authType;//authType

     /**权限描述 */
     private String authDesc;

    /**
     * 参数校验
     */
    private String authParams ;//

    /**
       *
       * 描述：权限编码
       * @author wxl
       * @param auth 操作权限
       * @param authCode 权限编码
       * @param authType 权限类型
       * @return
       */
    private AuthCodeEnum(String auth, String authCode, String authType) {
        this.auth = auth;
        this.authCode = authCode;
        this.authType = authType;
    }

     /**
         *
         * 描述：权限编码
         * @since
         * @param auth 操作权限
         * @param authCode 权限编码
         * @param authType 权限类型
         * @param authDesc 权限描述
         * @return
      */
        private AuthCodeEnum(String auth, String authCode, String authType, String authDesc, String authParams) {
             this.auth = auth;
             this.authCode = authCode;
             this.authType = authType;
             this.authDesc = authDesc;
             this.authParams = authParams;
         }

         public String getAuth() {
         return auth;
    }

         public void setAuth(String auth) {
         this.auth = auth;
     }

         public String getAuthCode() {
         return authCode;
     }

         public void setAuthCode(String authCode) {
         this.authCode = authCode;
     }

         public String getAuthDesc() {
         return authDesc;
     }

         public void setAuthDesc(String authDesc) {
         this.authDesc = authDesc;
     }

         public String getAuthType() {
                 return authType;
         }

         public void setAuthType(String authType) {
                 this.authType = authType;
          }

         public String getAuthParams() {
            return authParams;
        }

         public void setAuthParams(String authParams) {
            this.authParams = authParams;
        }

         @Override
         public String toString(){
             return String.format("auth:%s, authCode:%s, authType:%s, authDesc:%s, authParams:%s", this.auth, this.authCode, this.authType, this.authDesc,this.authParams);
         }

}
