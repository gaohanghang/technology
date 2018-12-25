package java知识.Java基础.开源工具包;

import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.CharUtils;

/**
 * 字符处理工具
 *
 * @author GaoHangHang
 * @date 2018/06/06 17:04
 **/
public class CharSetUtilsTest {
    public static void main(String[] args) {
        //计算字符串中包含某个字符数
        CharSetUtils.count("new Date(millis), pattern, DateUtils.UTC_TIME_ZONE, locale.", "aeiou");
        //结果13

        //删除字符串中某字符
        CharSetUtils.delete("new Date(millis), pattern, DateUtils.UTC_TIME_ZONE, locale.", "aeiou");
        //结果nw Dt(mlls), pttrn, DtUtls.UTC_TIME_ZONE, lcl

        //保留字符串中某字符
        CharSetUtils.keep("new Date(millis), pattern, DateUtils.UTC_TIME_ZONE, locale.", "aeiou");
        //结果eaeiiaeaeioae

        //合并重复的字符
        CharSetUtils.squeeze("a  bbbbbb c dd", "bd");
        //结果a b c d
    }
}
