package java知识.知识星球.直面java.a44comparator接口与Comparable接口的区别.ComparatorTest;

import java.util.*;

/**
 * Created by GaoHangHang 2018-05-17 10:56
 **/
public class ComparatorTest {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person(20, "P1"),
                new Person(60, "P2"),
                new Person(50, "P3"),
                new Person(40, "P4")
        };
        // Arrays.sort方法不支持使用Comparator比较器了，这里只能使用Collections.sort来排序
        List<Person> personList = Arrays.asList(persons);
        System.out.println("Before sort: \r\n" + personList);
        // 这里，将一个比较器（Comparator）传递给sort方法作为参数，按照里面的比较逻辑对Person进行排序
        Collections.sort(personList, new PersonComparator());
        System.out.println("After sort： \r\n" + personList);
    }
}

// 被比较的类型不需要实现任何接口
class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

// 这是一个比较器，用于比较Person对象
class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // 两个Person对象的比较过程，当然，这里可以实现更多更复杂的比较过程
        return o1.getAge() - o2.getAge();
        /*
            如果o1.age > 02.age，方法返回正数，为正数正是表明o1 > o2
            如果o1.age = o2.age，方法返回0，返回0正是表明o1 == o1
            如果o1.age < o2.age，方法返回正数，为负数正是表明哦o1 < o2
         */

    }
}
