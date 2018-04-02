package java8_day01.com.atguigu;

public class FilterEmployeeBySalary implements MyPredicate<Employee>{
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}
