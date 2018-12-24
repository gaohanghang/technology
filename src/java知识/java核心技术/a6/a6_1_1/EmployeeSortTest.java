package java知识.java核心技术.a6.a6_1_1;

import java.util.Arrays;

/**
 * @Description: 接口概念
 * This program demonstrates the use of the Comparable interface.
 * @author: Gao Hang Hang
 * @date 2018/12/24 14:04
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Harry Hacker", 75000);
        staff[2] = new Employee("Harry Hacker", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
