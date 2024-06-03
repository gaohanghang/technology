package java核心技术卷1.a4.a4_3.a4_3_1;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/08 12:55 PM
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Car Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's sarary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Emplyee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}
