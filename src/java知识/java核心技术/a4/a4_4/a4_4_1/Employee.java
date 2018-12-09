package java知识.java核心技术.a4.a4_4.a4_4_1;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/08 8:41 PM
 */
public class Employee {
    private static int nextId = 1;

    private int id;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = nextId;
        nextId++;
    }
}
