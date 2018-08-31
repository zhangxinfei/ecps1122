package cn.itcast.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by wxl on 2017/9/29.
 */
public class NumCodingUtils {
    /**
     * 生成编码(我的预案)
     * @return
     */
    public  static String getMyprogramNumbering(String wizard, String year, String letter)throws Exception {
        if(StringUtils.isBlank(wizard) || StringUtils.isBlank(year) || StringUtils.isBlank(letter)){
            throw new Exception("生成编码数据为空");
        }

        if(!"A0".equals(letter)){
            letter = getLetterNext(letter.substring((letter.length()-2),letter.length()));//获取下一个编码
        }
        StringBuffer str = new StringBuffer();
        str.append(wizard);//拼接业务精灵
        str.append(year.substring(2,4));//拼接年份
        str.append(letter);
        return str.toString();
    }


    /**
     * 根据上一个字母获取下一个字母
     * @param lett
     * @return
     */
    private static String getLetterNext(String lett){
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char [] letterArry = lett.toCharArray();//编码切分
        int num = Integer.valueOf(String.valueOf(letterArry[1]).trim());
        String lettr = String.valueOf(letterArry[0]).trim();
        if(9 != num){
            letter = lettr+String.valueOf(num+1);
        }else{
            letter= (letter.substring((letter.indexOf(lettr)+1),(letter.indexOf(lettr)+2)).toUpperCase()+"0");
        }

        return letter;
    }



    public static void main(String[] args) throws Exception {
        //System.out.print(getMyprogramNumbering("99999999","2017","A0"));
        System.out.print("12345".substring(("12345".length()-2),"12345".length()));
        // System.out.print(getLetterNext("b1"));
    }
}
