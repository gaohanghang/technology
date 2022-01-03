package java核心技术卷1.a5.a5_7.a5_7_4;

import java核心技术卷1.a5.Employee;

import java.lang.reflect.Field;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/21 15:13
 */
public class a5_7_4 {
    public static void main(String[] args) throws Exception {
        Employee harry = new Employee("Hary Hacker", 35000, 1989, 10, 1);
        Class cl = harry.getClass();
        // the name field of the Employee class
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        // the name field of the Employee class
        Object v = f.get(harry);
        // the value of the name field of harry object, i.e.，the String object "Harry Hacker"
        System.out.println(v.toString());
    }
}
