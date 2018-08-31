package cn.itcast.util.enums;

/**
 * Created by Administrator on 2017/7/1.
 */
public class AuthCommonEnum {
    public static final String USER_AUTH_EDIT = "EDIT";//编辑权限
    public static final String USER_AUTH_VIEW = "VIEW";//查看权限

    public static final String USER_AUTH_WIZARD_BUSINESS = "BW";//业务精灵
    public static final String USER_AUTH_WIZARD_RESOURCES = "SW";//资源精灵
    public static final String USER_AUTH_WIZARD_CONFIG = "CONF";//配置编辑权限

    public  static final String USER_AUTH_OPERATING_SAVE = "SAVE";
    public  static final String USER_AUTH_OPERATING_DELETE = "DELETE";
    public  static final String USER_AUTH_OPERATING_UPDATE = "UPDATE";
    public  static final String USER_AUTH_OPERATING_VIEW = "VIEW";
    public  static final String USER_AUTH_OPERATING_REPORTED = "REPORTED";
    public  static final String USER_AUTH_OPERATING_TURN_DOWN= "TURN_DOWN";
    public  static final String USER_AUTH_OPERATING_UPLOAD= "UPLOAD";
    public  static final String USER_AUTH_OPERATING_DOWN_LOAD= "DOWN_LOAD";

    public static final String USER_AUTH_TAB_BUSINESS = "SY999"; //"业务精灵"
    public static final String USER_AUTH_TAB_RESOURCES = "SY998"; //"资源精灵"
    public static final String USER_AUTH_TAB_INDUSTRY_OPERATIONS = "SY996"; //"行业运营平台"
    public static final String USER_AUTH_TAB_BUSINESS_OPERATIONS = "SY997"; //"业务经营平台"
    /**=========================业务精灵=====================================**/
    public static final String USER_AUTH_TAB_THREE_PROPHECY = "SY024"; //"三预页面"
    public static final String USER_AUTH_TAB_AUTHORITY_MANAGEMENT = "SY006"; //"权限管理"
    public static final String USER_AUTH_TAB_CONFIGURATION_EDIT = "SY005"; //"配置编辑"
    public static final String USER_AUTH_TAB_SHARE_PROFIT  = "SY025";//分享利润
    public static final String USER_AUTH_TAB_MY_PLAN = "SY008";// 我的预案
    public static final String USER_AUTH_TAB_MY_INCOME = "SY011";//我的收益
    public static final String USER_AUTH_TAB_MY_BUDGET = "SY010";//我的预算
    public static final String USER_AUTH_TAB_RESOURCES_NEED =  "SY009";//我的资源需求
    public static final String USER_AUTH_TAB_BEFOREHAND_COUNT_WIN = "SY002";//事前算赢
    public static final String USER_AUTH_TAB_MY_MARKET = "SY007";//我的市场
    public static final String USER_AUTH_TAB_REPORTED_MANAGEMENT = "SY016";//业务精灵上报管理
    public static final String USER_AUTH_TAB_ORGANIZATIONAL_CONFIGURATION_HOLDING = "SY023";//组织配置-控股
    public static final String USER_AUTH_TAB_ORGANIZATIONAL_CONFIGURATION_COMPANY =  "SY022";//组织配置-企业
    public static final String USER_AUTH_TAB_RESOURCE_NEED_CONFIG_COMPANY =  "SY014";//资源需求配置_企业
    public static final String USER_AUTH_TAB_RESOURCE_NEED_KPI_CONFIG =  "SY012";//资源需求指标配置
    public static final String USER_AUTH_TAB_SHARE_PROFIT_RULE_CONFIG =  "SY019";//分享利润规则配置
    public static final String USER_AUTH_TAB_BUSSINESS_CONFIG =  "SY017";//业务单元配置
    public static final String USER_AUTH_TAB_AUTH_CONFIG_HOLDING = "SY021";//权限配置页-控股
    public static final String USER_AUTH_TAB_AUTH_CONFIG_COMPANY = "SY020";//权限配置页-公司
    public static final String USER_AUTH_TAB_PEOPLE_REWARD_STANDARD  = "SY018";//人单酬标准
    public static final String USER_AUTH_TAB_KPI_RANGE_CONFIG = "SY015";//指标范围配置_企业
    public static final String USER_AUTH_TAB_BUSS_KPI_CONFIG = "SY013";//指标范围配置_控股
    public static final String USER_AUTH_TAB_REPORTED_MANAGEMENT_PERSONAL = "SY038";//业务精灵上报管理_个人
    public static final String USER_AUTH_TAB_BW_AFTERWARDS_SHARE = "SY004";//配置编辑
    /**=========================资源精灵=====================================**/
    public static final String USER_AUTH_TAB_SW_BEFOREHAND_COUNT_WIN = "SY026";//事前算赢
    public static final String USER_AUTH_TAB_SW_THREE_PROPHECY = "SY027"; //"三预编制"
    public static final String USER_AUTH_TAB_SW_MY_MARKET = "SY028";//我的市场
    public static final String USER_AUTH_TAB_SW_TAB_MY_PLAN = "SY029";// 我的预案
    public static final String USER_AUTH_TAB_SW_ROUTINE_MATTER = "SY030";//例行事项
    public static final String USER_AUTH_TAB_SW_RESOURCES_NEED =  "SY031";//我的资源需求
    public static final String USER_AUTH_TAB_SW_MY_INCOME = "SY032";//我的收益
    public static final String USER_AUTH_TAB_SW_MATTER_MANAGEMENT = "SY033";//事中管理
    public static final String USER_AUTH_TAB_SW_AFTERWARDS_SHARE = "SY034";//事后分享
    public static final String USER_AUTH_TAB_SW_CONFIGURATION_EDITOR = "SY035";//配置编辑
    /**========================配置编辑==========================================**/
    public static final String USER_AUTH_TAB_CONF_ICOME_SHARE_RLUE = "SY039";//配置编辑
    public static final String USER_AUTH_TAB_CONF_AIMS_RLUE = "SY040";//目标




    public enum WizardType {

        USER_AUTH_WIZARD_BUSINESS("BW", "业务精灵"),  USER_AUTH_WIZARD_RESOURCES("ZY", "资源精灵");
        public String value;
        public String desc;

        private WizardType(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(Integer value) {
            for (WizardType c : WizardType.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }


        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum WizardTypeTab {
        USER_AUTH_TAB_BUSINESS("SY999", "业务精灵"),
        USER_AUTH_TAB_RESOURCES("SY998", "资源精灵"),
        USER_AUTH_TAB_INDUSTRY_OPERATIONS("SY996", "行业运营平台"),
        USER_AUTH_TAB_BUSINESS_OPERATIONS("SY997", "业务经营平台"),
        USER_AUTH_TAB_CONFIG_OPERATIONS("SY995", "配置编辑"),
        USER_AUTH_TAB_THREE_PROPHECY("SY024", "三预页面"),
        USER_AUTH_TAB_THINGS_WIN("SY002", "事前算赢"),
        USER_AUTH_TAB_AUTHORITY_MANAGEMENT("SY006", "权限管理"),
        USER_AUTH_TAB_CONFIGURATION_EDIT("SY005", "配置编辑");



        public String value;
        public String desc;

        private WizardTypeTab(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(Integer value) {
            for (WizardType c : WizardType.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }


        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum WizardAuth {

        USER_AUTH_EDIT("EDIT", "编辑"),  USER_AUTH_VIEW("VIEW", "查看");
        public String value;
        public String desc;

        private WizardAuth(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(Integer value) {
            for (WizardType c : WizardType.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }


        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}

