package cn.itcast.util;

import java.math.BigDecimal;

/**
 * Created by wxl on 2018/7/13.
 * bigdecimal 工具类
 */
public class BigDecimalUtils {

    /**
     * decimal 是否大于 numStr
     * 大于 时，返回 1
     * @param decimal
     * @param numStr
     * @return
     */
    public static Boolean cpmpareMoreNum(BigDecimal decimal, String numStr){
        BigDecimal num = new BigDecimal(numStr);
        int state = decimal.compareTo(num);
        return state==1;
    }

    /**
     * decimal 是否小于 numStr
     * 小于 时，返回 -1
     * @param decimal
     * @param numStr
     * @return
     */
    public static Boolean cpmpareLessNum(BigDecimal decimal, String numStr){
        BigDecimal num = new BigDecimal(numStr);
        int state = decimal.compareTo(num);
        return state==-1;
    }

    /**
     * decimal 是否小于 numStr
     * 等于 时，返回 0
     * @param decimal
     * @param numStr
     * @return
     */
    public static Boolean cpmpareEqualNum(BigDecimal decimal, String numStr){
        BigDecimal num = new BigDecimal(numStr);
        int state = decimal.compareTo(num);
        return state==0;
    }

    /**
     * 加法计算
     * @param decimal1
     * @param decimal2
     * @return
     */
    public static BigDecimal additionNum(BigDecimal decimal1, BigDecimal decimal2){
        BigDecimal result1 = decimal1.add(decimal2);
        return result1;
    }

    /**
     * 除法计算
     * @param decimal1
     * @param decimal2
     * @return
     */
    public static BigDecimal divisionNum(BigDecimal decimal1, BigDecimal decimal2){
        BigDecimal result = decimal1.divide(decimal2);
        return result;
    }

    /**
     * 减法操作
     * @param decimal1
     * @param decimal2
     * @return
     */
    public static BigDecimal subtractionNum(BigDecimal decimal1, BigDecimal decimal2){
        BigDecimal result = decimal1.subtract(decimal2);
        return result;
    }

/*
        12         //减法
        13         BigDecimal result2 = num1.subtract(num2);
        14         out.println("差    是   :  " + result2);
        15
        16         //乘法
        17         BigDecimal result3 = num1.multiply(num2);
        18         out.println("积    是   :  " + result3);
        19
        23
        24         //比较
        25         BigDecimal num = new BigDecimal("100");     //用做比较的值
        26         out.println(num1.compareTo(num2));            //大于 时，返回 1
        27         out.println(num.compareTo(num1));            //等于 时，返回 0
        28         out.println(num2.compareTo(num1));            //小于 时，返回 -1
        29
        30         out.println(num1.min(num2));                //求两个数的最小值,返回小的数
        31         out.println(num1.max(num2));                //求两个数的最大值,返回大的数
        32
        33 //        compareTo方法比较时,不同于equals方法,需要两边都不为null,否则会报空指针异常,
        34 //        源码如下
        35 //        public int compareTo(BigDecimal val) {
        36 //            // Quick path for equal scale and non-inflated case.
        37 //            if (scale == val.scale) {
        38 //                long xs = intCompact;
        39 //                long ys = val.intCompact;
        40 //                if (xs != INFLATED && ys != INFLATED)
        41 //                    return xs != ys ? ((xs > ys) ? 1 : -1) : 0;
        42 //            }
        43 //            int xsign = this.signum();
        44 //            int ysign = val.signum();
        45 //            if (xsign != ysign)
        46 //                return (xsign > ysign) ? 1 : -1;
        47 //            if (xsign == 0)
        48 //                return 0;
        49 //            int cmp = compareMagnitude(val);
        50 //            return (xsign > 0) ? cmp : -cmp;
        51 //        }
        52
        53 //        max/min方法源代码如下
        54 //        public BigDecimal max(BigDecimal val) {
        55 //            return (compareTo(val) >= 0 ? this : val);
        56 //        }
        57 //        public BigDecimal min(BigDecimal val) {
        58 //            return (compareTo(val) <= 0 ? this : val);
        59 //        }
        60     }
    61 }*/
}
