package day01.com.atguigu.java8;

import org.junit.Test;

import java.util.Optional;

public class TestOptional {

    /*
        Optional 容器类的常用方法：
        Optional.of(T t)：创建一个 Optional 实例
        Optional.empty() ：创建一个空的Optional 实例
        Optional.ofNullable(T t)：若 t 不为 null，创建 Optional 实例，否则创建空实例
        isPresent()：判断是否包含值
        orElse(T t)：如果调用对象包含值，返回该值，否则返回t
        orElseGet(Supplier s)：如果调用对象包含值，返回该值，否则返回 s 获取的值
        flatMap(Function mapper):与map类似，要求返回值必须是Optional
     */
    @Test
    public void test4() {
        Optional<Employee> op = Optional.ofNullable(new Employee("张三", 18, 888.88));

        /*Optional<String> str = op.map((e) -> e.getName());
        System.out.println(str.get());*/

        Optional<String> str2 = op.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(str2.get());
    }


    @Test
    public void test3() {
        Optional<Employee> op = Optional.ofNullable(null);

        /*if (op.isPresent()){
            System.out.println(op.get());
        }*/

       /* Employee emp = op.orElse(new Employee("张三", 18,888.88, Status.Free));
        System.out.println(emp);*/

        Employee emp = op.orElseGet(() -> new Employee());
        System.out.println(emp);
    }

    @Test
    public void test2() {
        Optional<Employee> op = Optional.empty();
        System.out.println(op.get());
    }

    @Test
    public void test1() {
        Optional<Employee> op = Optional.of(null);

        Employee emp = op.get();
        System.out.println(emp);
    }
}
