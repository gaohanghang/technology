package java核心技术卷1.a4.a4_3.a4_3_1;

import java.time.LocalDate;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/08 12:52 PM
 */
public class Employee {
    // instance fields
    private String name;       // 姓名
    private double salary;     // 薪水
    private LocalDate hireDay; // 入职日期

    // constructor
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // a method
    public String getName() {
        return name;
    }

    // more methods
    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
