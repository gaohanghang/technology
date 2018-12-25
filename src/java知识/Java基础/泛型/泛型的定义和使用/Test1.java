package java知识.Java基础.泛型.泛型的定义和使用;

public class Test1<T> {

    public void testMethod(T t) {
        System.out.println(t.getClass().getName());
    }

    public <E> E testMethod1(E e) {
        return e;
    }

}
