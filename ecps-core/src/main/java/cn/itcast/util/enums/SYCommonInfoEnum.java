package cn.itcast.util.enums;

import java.util.UUID;

/**
 * Created by wxl on 2017/8/2.
 */
public class SYCommonInfoEnum {
    public static int  POI_RAM_DATA_AMOUNT = 1000;//编辑权限
    public static String POI_SHEET_NAME = "sheet";//sheet主体名称后面追加号码
    public static String POI_PASSWORD_CODE = "qysldett211985";//sheet主体名称后面追加号码
    public static String POI_SAYUN_ENCODE =  UUID.randomUUID().toString().replaceAll("-", "");//三预编制下载编码;
    public static String POI_SAYUNPERSON_ENCODE = UUID.randomUUID().toString().replaceAll("-", "");//三预编制下载编码
    //获取版本信息
    public enum VersionInfo {

        SY_VERSION_WON_BID("WB", "中标版本"),SY_VERSION_BID("CB","竞标");
        public String value;
        public String desc;

        private VersionInfo(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(Integer value) {
            for (VersionInfo c : VersionInfo.values()) {
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

    /**
     * 数据导出 锁密码
     */
 /*   public enum PoiSheetPassword {

        SY_BUDGET_MY_PASSWORD("BUDGET", "85b99366-cfd1-4d0d-b4d2-97efe6c2852a");
        public String value;
        public String desc;

        private PoiSheetPassword(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(Integer value) {
            for (VersionInfo c : VersionInfo.values()) {
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
    }*/

    public enum FormulaChangeEnum {

        FORMULA_CHANGE_TRUE(1, "公式已更改"),FORMULA_CHANGE_FALSE(0, "公式未修改默认值");
        public Integer value;
        public String desc;

        private FormulaChangeEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 公共删除枚举
     */
    public enum COMMON_ISDELETE_STATUS {
        DELETE_NO(10, "默认"), DELETE_YES(20, "删除");
        public Integer value;
        public String desc;

        private COMMON_ISDELETE_STATUS(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 业务发单 单子状态
     */
    public enum BILLING_STATUS {
        BILLING_WINNING_BID(10, "中标"), BILLING_BID(20, "竞标");
        public Integer value;
        public String desc;

        private BILLING_STATUS(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
    
    public enum kpiIsStatus {
        kpi_status_ok(0, "正常"), kpi_status_no(1, "删除");
        public Integer value;
        public String desc;

        private kpiIsStatus(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(String value) {
            for (kpiIsStatus c : kpiIsStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 三预个人 与 三预编制数据 区分，枚举编号
     */
    public enum THREE_PEOPLE_CUSTOMER_TYPE {
         PERSONAL_YES("01", "三预个人"), PERSONAL_NO("02", "三预");
        public String value;
        public String desc;

        private THREE_PEOPLE_CUSTOMER_TYPE(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(String value) {
            for (THREE_PEOPLE_CUSTOMER_TYPE c : THREE_PEOPLE_CUSTOMER_TYPE.values()) {
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

    /**
     * 返回状态值枚举
     */
    public enum RESULT_STATUS {
        STATUS_OK(10, "正常"), UPDATE_STATUS_NO(20, "更新失败"), INSERT_STATUS_NO(30, "插入失败"),DELETE_STATUS_NO(40, "删除失败"),PARAMS_STATUS_YES(60, "参数异常"),UPLOAD_ERROR(70, "上传失败");
        public Integer value;
        public String desc;

        private RESULT_STATUS(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(String value) {
            for (kpiIsStatus c : kpiIsStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum DROP_DOWN_LIST {
        DAY_TYPE("月,季,年", "日期类型");
        public String value;
        public String desc;

        private DROP_DOWN_LIST(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(String value) {
            for (kpiIsStatus c : kpiIsStatus.values()) {
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

    /**
     * 指标等级枚举
     */
    public enum KPI_LEVEL_ENUM {
        ONE_KPI_LEVEL(1, "一级"),TWO_KPI_LEVEL(2, "二级"),THREE_KPI_LEVEL(3, "三级");
        public Integer value;
        public String desc;

        private KPI_LEVEL_ENUM(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(String value) {
            for (kpiIsStatus c : kpiIsStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 指标类型
     */
    public enum KPI_ZTYPE_ENUM {
        KPI_TYPE_INCOME(1, "收入"),KPI_TYPE_COST(2, "成本"),KPI_TYPE_MONEY(3, "费用"),KPI_TYPE_PROFIT(4, "利润"),KPI_TYPE_AMOUNT(5, "量"),KPI_TYPE_SHARE(6, "分享利润");
        public Integer value;
        public String desc;

        private KPI_ZTYPE_ENUM(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static String getDesc(String value) {
            for (kpiIsStatus c : kpiIsStatus.values()) {
                if (c.getValue().equals(value)) {
                    return c.desc;
                }
            }
            return null;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
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
