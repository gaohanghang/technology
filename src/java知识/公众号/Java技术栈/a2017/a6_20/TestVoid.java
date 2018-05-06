package java知识.公众号.Java技术栈.a2017.a6_20;

public class TestVoid {
    public static void main(String[] args) {
        test1();

        Void v1 = test2();
        System.out.println(v1);// null

        BaseDao<Void> dao = new BaseDao<>();
        Void v2 = dao.get();
        System.out.println(v2);// null
    }

    public static void test1() {

    }

    public static Void test2() {
        return null;
    }

    static class BaseDao<T> {

        public T get() {
            // ...
            return null;
        }
    }
}
