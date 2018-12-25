package java知识.知识星球.直面java.a44comparator接口与Comparable接口的区别.comparableTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by GaoHangHang 2018-05-17 10:38
 **/
public class ComparableTest {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person(20, "P1"),
                new Person(60, "P2"),
                new Person(50, "P3"),
                new Person(40, "P4")
        };
        Arrays.sort(persons);
        System.out.println();
        //下面代码的结果一样
        List<Person> personList = Arrays.asList(persons);
        Collections.sort(personList);
        System.out.println(personList);
    }
}

class Person implements Comparable<Person> {
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

    //实现Comparable接口的compareTo方法
    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
