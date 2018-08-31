package cn.itcast.util;

import java.util.ArrayList;
import java.util.List;

public class mainUtils {
    public static String hebing(String shuju, String name){
        List<String> a=new ArrayList<String>();
        //把数据按照"，"分开
        String[] shuju1=shuju.split(",");
        //把数据按照"（"分开
        for(String tmp:shuju1){
            String[] shuju2=tmp.split("\\(");
            //得到"("前面的数据，存入集合a
            a.add(shuju2[0]);
        }
        List<String> b=new ArrayList<String>();
        //把数据按照"？"分开
        String[] name1 = name.split("\\?");
        for(int j=0;j<name1.length;j++){
            b.add(name1[j]);
        }
        List<String> ab = new ArrayList<String>();
        String hebing = "";
        //输出数据
        if(a.size() == b.size()){
            for(int i=0;i<b.size();i++){
                ab.add(b.get(i)+a.get(i));//把集合a和集合b中的每一个字符串连接
//                System.out.println(ab.get(i));
            }
        }else {
            System.out.println("数据的数量和名称的数量不对应！");
        }
        for (int j=0;j<ab.size();j++){
            hebing += ab.get(j);
        }
        return hebing;
    }
    public static void main(String[] args) {
        //数据字符串
        String shuju = "SELECT t1.kpi_name, t1.kpi_code, t1.kpi_zunit, t1.kpi_show, t1.kpi_status, t1.kpi_formula_code, t1.kpi_formula_last_month_code, t1.kpi_formula_last_this_month_code, t1.kpi_formula_last_zsum_code, t1.kpi_formula_difference_amount_code, t1.kpi_formula_difference_rate_code, t1.kpi_formula_zsum_code, t1.kpi_formula_month01_code, t1.kpi_formula_month02_code, t1.kpi_formula_month03_code, t1.kpi_formula_month04_code, t1.kpi_formula_month05_code, t1.kpi_formula_month06_code, t1.kpi_formula_month07_code, t1.kpi_formula_month08_code, t1.kpi_formula_month09_code, t1.kpi_formula_month10_code, t1.kpi_formula_month11_code, t1.kpi_formula_month12_code, t1.kpi_formula_open_row_status, t1.kpi_number_digits, t1.industrial_group_code, t1.table_code, t1.kpi_level_code, t1.kpi_desc, t1.kpi_valuechar_code, t2.budget_id, ? as budget_year, if(t7.budget_last_month IS NULL ,IFNULL(t2.budget_last_month,0.0000) ,IFNULL(t7.budget_last_month,0.0000) ) as budget_last_month, if(t7.budget_this_month IS NULL,IFNULL(t2.budget_this_month,0.0000) , IFNULL(t7.budget_this_month,0.0000) as budget_this_month), if(t7.budget_last_zsum IS NULL, IFNULL(t2.budget_last_zsum,0.0000) , IFNULL(t7.budget_last_zsum,0.0000)) as budget_last_zsum, if(t7.budget_difference_amount IS NULL, IFNULL(t2.budget_difference_amount,0.0000) , IFNULL(t7.budget_difference_amount,0.0000)) as budget_difference_amount, if(t7.budget_difference_rate, IFNULL(t2.budget_difference_rate,0.0000) , IFNULL(t7.budget_difference_rate,0.0000)) as budget_difference_rate, if(t7.budget_zsum IS NULL,IFNULL(t2.budget_zsum,0.0000) , IFNULL(t7.budget_zsum,0.0000)) as budget_zsum, if(t7.budget_month_one IS NULL, IFNULL(t2.budget_month_one,0.0000), IFNULL(t7.budget_month_one,0.0000)) as budget_month_one , if(t7.budget_month_two IS NULL, IFNULL(t2.budget_month_two,0.0000), IFNULL(t7.budget_month_two,0.0000)) as budget_month_two, if(t7.budget_month_three IS NULL,IFNULL(t2.budget_month_three,0.0000) , IFNULL(t7.budget_month_three,0.0000)) as budget_month_three, if(t7.budget_month_four IS NULL, IFNULL(t2.budget_month_four,0.0000), IFNULL(t7.budget_month_four,0.0000)) as budget_month_four, if(t7.budget_month_five IS NULL,IFNULL(t2.budget_month_five,0.0000), IFNULL(t7.budget_month_five,0.0000)) as budget_month_five, if(t7.budget_month_six IS NULL,IFNULL(t2.budget_month_six,0.0000) , IFNULL(t7.budget_month_six,0.0000) ) as budget_month_six, if(t7.budget_month_seven IS NULL,IFNULL(t2.budget_month_seven,0.0000) , IFNULL(t7.budget_month_seven,0.0000)) as budget_month_seven, if(t7.budget_month_eight IS NULL,IFNULL(t2.budget_month_eight,0.0000) , IFNULL(t7.budget_month_eight,0.0000)) as budget_month_eight, if(t7.budget_month_nine IS NULL, IFNULL(t2.budget_month_nine,0.0000),IFNULL(t7.budget_month_nine,0.0000) ) as budget_month_nine , if(t7.budget_month_ten IS NULL,IFNULL(t2.budget_month_ten,0.0000) ,IFNULL(t7.budget_month_ten,0.0000) ) as budget_month_ten , if(t7.budget_month_eleven IS NULL,IFNULL(t2.budget_month_eleven,0.0000) , IFNULL(t7.budget_month_eleven,0.0000)) as budget_month_eleven, if(t7.budget_month_twelve IS NULL, IFNULL(t2.budget_month_twelve,0.0000), IFNULL(t7.budget_month_twelve,0.0000)) as budget_month_twelve, t2.operator_code, t2.budget_status, t2.budget_type_code, t3.industrial_group_name, t4.area_name, t5.kpi_unit_name, ? as area_code, ? as partition_code, IF(t2.note=''||t2.note is NULL ,t1.note,t2.note) AS note, t6.partition_name FROM sys_common_table t0 LEFT JOIN sys_common_conf_kpi t1 ON t1.table_code = t0.table_code AND t0.table_status = ? AND t1.kpi_status = ? LEFT JOIN ( SELECT budget_id, table_code, industrial_group_code, area_code, partition_code, budget_year, budget_last_month, budget_this_month, budget_last_zsum, budget_difference_amount, budget_difference_rate, budget_zsum, budget_month_one, budget_month_two, budget_month_three, budget_month_four, budget_month_five, budget_month_six, budget_month_seven, budget_month_eight, budget_month_nine, budget_month_ten, budget_month_eleven, budget_month_twelve, budget_type_code, kpi_code, budget_status, budget_version FROM sys_bd_budget WHERE budget_status = ? ) t2 ON t1.industrial_group_code = t2.industrial_group_code AND t1.table_code = t2.table_code AND t1.kpi_code = t2.kpi_code AND t2.budget_year = ? AND t2.budget_status = ? AND t1.kpi_status =? AND t2.area_code = ? AND t2.partition_code = ? LEFT JOIN sys_common_org_industrial_group t3 ON t1.industrial_group_code = t3.industrial_group_code AND t3.industrial_group_status = ? LEFT JOIN sys_common_org_area t4 ON t4.area_code = ? AND t4.area_status = ? LEFT JOIN sys_common_kpi_unit t5 ON t1.kpi_zunit = t5.kpi_unit_code AND t5.kpi_unit_status = ? LEFT JOIN sys_common_org_partition t6 ON t6.partition_code = ? and t6.partition_status = ? LEFT JOIN ( SELECT budget_id, table_code, industrial_group_code, area_code, partition_code, budget_year, budget_last_month, budget_this_month, budget_last_zsum, budget_difference_amount, budget_difference_rate, budget_zsum, budget_month_one, budget_month_two, budget_month_three, budget_month_four, budget_month_five, budget_month_six, budget_month_seven, budget_month_eight, budget_month_nine, budget_month_ten, budget_month_eleven, budget_month_twelve, budget_type_code, kpi_code, budget_status, budget_version FROM sys_bd_budget WHERE budget_status = ? ) t7 ON t1.industrial_group_code = t7.industrial_group_code AND t1.table_code = t7.table_code AND t1.kpi_code = t7.kpi_code AND t7.budget_year = ? AND t7.budget_status = ? AND t1.kpi_status =? AND t7.area_code = ? AND t7.partition_code = ? WHERE t1.industrial_group_code = ? AND t1.kpi_status = ? AND t0.table_status = ? AND t0.industrial_group_code = ? order BY t1.kpi_order";
        //数据对应的名称
        String name = "2018(String), 8000(String), EMPTY(String), 10(Integer), 10(Integer), 10(Integer), 2018(String), 10(Integer), 10(Integer), 8000(String), EMPTY(String), 10(Integer), 8000(String), 10(Integer), 10(Integer), EMPTY(String), 10(Integer), 10(Integer), 2018(String), 10(Integer), 10(Integer), 8000(String), EMPTY(String), ECEJ_10000000(String), 10(Integer), 10(Integer), ECEJ_10000000(String)";
        String a = hebing(shuju,name);
        System.out.println(a);
    }
}
