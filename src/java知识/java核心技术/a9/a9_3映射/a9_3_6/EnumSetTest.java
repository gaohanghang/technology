package java知识.java核心技术.a9.a9_3映射.a9_3_6;

import java.util.EnumSet;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-16 16:25
 **/
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.TUSDAY);
        EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.TUSDAY);

        System.out.println(always);
        System.out.println(never);
        System.out.println(workday);
        System.out.println(mwf);
    }

    enum Weekday {
        MONDAY,
        TUSDAY,
        WEDNSDAY
    }
}
