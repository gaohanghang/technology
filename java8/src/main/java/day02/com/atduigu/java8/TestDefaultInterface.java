package day02.com.atduigu.java8;

public class TestDefaultInterface {

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        System.out.println(sc.getName());

        MyInterface.show();
    }
}
