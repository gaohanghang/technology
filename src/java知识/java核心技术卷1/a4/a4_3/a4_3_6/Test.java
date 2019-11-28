package java知识.java核心技术卷1.a4.a4_3.a4_3_6;

import java.util.Date;

/**
 * @Description: 封装的优点
 * @author: Gao Hang Hang
 * @date 2018/12/08 1:20 PM
 */
public class Test {
    public static void main(String[] args) {
        Employee harry = new Employee();
        Date d = harry.getHireDay();
        double thenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() - (long) thenYearsInMilliSeconds);
        // let's give Harry ten years of added seniority
    }
}
