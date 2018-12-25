package java知识.Java基础.常用接口.Comparable和Comparator的区别;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Comparable翻译为“可比较的”，表明实现该接口的类都是可以比较的，即实现Comparable接口的类本身就已经支持自比较，
 * 例如： String、Integer 自己就可以完成比较大小操作，它们已经实现了Comparable接口。查看
 *
 * @author GaoHangHang
 * @date 2018/07/28 16:07
 **/
public class ComparableTest2 {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person(20, "P1"),
                new Person(60, "p2"),
                new Person(50, "p3"),
                new Person(40, "p4")
        };
        Arrays.sort(persons);
        System.out.println();
        //下面的代码的结果一样
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
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
