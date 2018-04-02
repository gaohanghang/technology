package java8_day01.com.atguigu;

public class FilterEmployeeByAge implements MyPredicate<Employee>{

    public boolean test(Employee t) {
        return t.getAge() >=35;
    }
}
