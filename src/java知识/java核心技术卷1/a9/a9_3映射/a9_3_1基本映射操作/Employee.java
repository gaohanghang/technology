package java知识.java核心技术卷1.a9.a9_3映射.a9_3_1基本映射操作;

/**
 * @Description A minimalist employee class for testing purposes.
 * @Author Gao Hang Hang
 * @Date 2019-06-02 14:55
 **/
public class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     * @param name the employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
