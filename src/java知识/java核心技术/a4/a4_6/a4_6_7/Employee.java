package java知识.java核心技术.a4.a4_6.a4_6_7;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/12 19:33
 */
public class Employee {
    private static int nextId;

    private int id;
    private String name;
    private double salary;

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee() {
        name = "";
        salary = 0;
    }
}
