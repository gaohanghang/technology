package java知识.java核心技术.a5.a5_2_3;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 12:19
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hirDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hirDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHirDay() {
        return hirDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) return true;

        // must return false id the explicit parameter is null
        if (otherObject == null) return false;

        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) return false;

        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        // test whether the fields have identical values
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hirDay, other.hirDay);
    }

    public int hashCoe() {
        return Objects.hash(name, salary, hirDay);
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hirDay + "]";
    }
}
