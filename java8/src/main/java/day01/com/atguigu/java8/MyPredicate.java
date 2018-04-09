package day01.com.atguigu.java8;

@FunctionalInterface
public interface MyPredicate<T> {

    public boolean test(T t);

}
