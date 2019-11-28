package java知识.java核心技术卷1.a4.a4_2.a4_2_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/08 12:02 PM
 */
public class Test {
    public static void main(String[] args) {
        GregorianCalendar someDay = new GregorianCalendar(1999, 11, 31);
        // Odd feature of the class: month numbers go from 0 to 11
        someDay.add(Calendar.DAY_OF_MONTH, 1000);

        int year = someDay.get(Calendar.YEAR);
        int month = someDay.get(Calendar.MONTH);
        int day = someDay.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + " " + month + " " + day);
    }
}
