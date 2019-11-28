package java知识.java核心技术卷1.a6.a6_1.a6_1_1;

import java.util.Date;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/24 14:06
 */
public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setHireDay(int year, int month, int day) {
        this.hireDay = new Date(year, month, day);
    }

    /**
     * Compares employees by salary
     *
     * @param other another Employee object
     * @return a negative if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
     */
    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    /*浅拷贝*/
    // raise visibility level to public, change return type
    // public Employee clone() throws CloneNotSupportedException {
    //     return (Employee) super.clone();
    // }

    /*深拷贝*/
    public Employee clone() throws CloneNotSupportedException {
        // call Object.clone()
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }
}
