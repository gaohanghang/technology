package java核心技术卷1.a5.a5_1_9;

/**
 * @Description: This program demonstrates abstract classes.
 * @author: Gao Hang Hang
 * @date 2018/12/20 09:57
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for (Person p : people) {
            System.out.println(p.getName() + "+" + p.getDescription());
        }
    }
}
