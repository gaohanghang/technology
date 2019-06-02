package java知识.java核心技术.a9.a9_3映射.a9_3_1基本映射操作;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description This program demonstrates the use of a map with key type String and value type Employee.
 * @Author Gao Hang Hang
 * @Date 2019-06-02 14:58
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        // print all entries

        System.out.println(staff);

        // remove an entry

        staff.remove("567-24-2546");

        // replace an entry

        staff.put("456-62-5527", new Employee("Francesca Miller"));

        // look up a value

        System.out.println(staff.get("157-62-7935"));

        // iterate through all entries

        staff.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));
    }
}
