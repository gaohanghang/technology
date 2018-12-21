package java知识.java核心技术.a5.a5_2_1;

import java知识.java核心技术.a5.a5_1_9.Person;

import java.rmi.Naming;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 10:37
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) return true;

        // must return false if the explicit prameter is null
        if (otherObject == null) return false;

        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        // now we know otherObject is a non-null Emplyee
        Employee other = (Employee) otherObject;

        // test whether the fields have identical values
        // return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);

        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }
}
