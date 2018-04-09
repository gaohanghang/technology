package day01.com.atguigu.java8;

public class FilterEmployeeByAge implements MyPredicate<Employee>{

    public boolean test(Employee t) {
        return t.getAge() >=35;
    }
}
