package java知识.公众号.Java技术栈;

public class TestObjectConvert {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Fruit fruit1 = new Fruit();
        Apple apple1 = new Apple();
        apple1 = (Apple) fruit1;
    }

    private static void test2() {
        Fruit fruit1 = new Apple();
        Apple apple1 = new Apple();
        apple1 = (Apple) fruit1;
    }

    static class Fruit {

    }

    static class Apple extends Fruit {

    }
}
