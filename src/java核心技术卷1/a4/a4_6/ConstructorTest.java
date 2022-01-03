package java核心技术卷1.a4.a4_6;

import java.util.Random;

/**
 * @Description: This program demonstrates object construction.
 * @author: Gao Hang Hang
 * @date 2018/12/12 19:56
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // fill

        Employee employee = new Employee();
    }
}

class Employee {
    private static int nextId;

    private static int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block
    static {
        Random generator = new Random();
        // set  nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);

    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        // class the Employee(String, double) contructor
        this("Employee #" + nextId, s);
    }

    // the default constructor
    public Employee() {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
