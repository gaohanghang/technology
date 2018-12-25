package java知识.Java基础.开源工具包;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GaoHangHang
 * @date 2018/06/06 16:34
 **/
public class StringUtilsTest {
    public static void main(String[] args) {
        // 1.数组拼接
        String[] array = {"aaa", "bbb", "ccc"};

        /*
            1.1使用StringUtils
         */
        StringUtils.join(array, ",");
        //结果"aaa,bbb,ccc"

        /*
            1.2使用StringUtils
         */
        // 对比版，也是简陋版
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            buffer.append(array[i] + ",");
        }


        // 2.集合元素拼接
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        StringUtils.join(list, ",");

        //对null处理，给予自定义字符
        //StringUtils.defaultString(String str, String defaultStr)
        //结果为defaultStr

        ObjectUtils.defaultIfNull(null, "空");//结果 空

        // ""和null为true这个判断是用的比较多的，底层是计算长度。
        /*StringUtils.isEmpty();*/

        //3.检查一字符是否为另一字符串的子集
        StringUtils.containsOnly("", "aaaad");
        //结果true

        //4.去除字符中的空格
        StringUtils.deleteWhitespace("aa bb cc");
        //结果aabbcc

        //5.判断是否是某类字符（判断的一系列小工具）
        StringUtils.isAlpha("ab");
        //true null为false  Character.isLetter(str.charAr(i))

        //是否为字符或数字
        StringUtils.isNumeric("all");
        //true null为false

        // 是否为空
        StringUtils.isBlank("");
        //true ""和null为true

        //是否为数字
        StringUtils.isNumeric("123");
        //true null false

        //去除字符串中的"\n", "\r", or "\r\n"
        StringUtils.chomp("abc\r\n");
        //---"abc"
    }
}
