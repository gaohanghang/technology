package day02.com.atduigu.exer;

import day01.com.atguigu.java8.Employee;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStreamAPI {

    /*
        1. 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
        给定【1,2,3,4,5】，应该返回【1,4,9,16,25】.

     */
    @Test
    public void test1(){
        Integer[] nums = new Integer[]{1,2,3,4,5};

        Arrays.stream(nums)
                .map((x) -> x*x)
                .forEach(System.out::println);
    }

    /*
        2. 怎么用map 和 reduce 方法数数流中有多少个Employee呢？
     */
    List<Employee> emps = Arrays.asList(
            new Employee(101,"张三",18,9999.99, Employee.Status.FREE),
            new Employee(102,"李四",39,5555.55,Employee.Status.BUSY),
            new Employee(103,"王五",50,3333.33,Employee.Status.VOCATION),
            new Employee(104,"赵六",16,6666.66,Employee.Status.FREE),
            new Employee(105,"赵六",16,6666.66,Employee.Status.FREE),
            new Employee(106,"赵六",16,6666.66,Employee.Status.FREE),
            new Employee(107,"田七",8,8888.88,Employee.Status.BUSY)
    );
    @Test
    public void test2(){
        Optional<Integer> count = emps.stream()
                .map((e) -> 1)
                .reduce(Integer::sum);

        System.out.println(count.get());
    }

}
