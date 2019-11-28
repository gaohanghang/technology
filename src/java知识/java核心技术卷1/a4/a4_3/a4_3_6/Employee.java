package java知识.java核心技术卷1.a4.a4_3.a4_3_6;

import java.util.Date;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/08 1:28 PM
 */
public class Employee {
    private Date hireDay;

    public Date getHireDay() {
        // return hireDay; // Bad
        return (Date) hireDay.clone(); // Ok
    }
}
