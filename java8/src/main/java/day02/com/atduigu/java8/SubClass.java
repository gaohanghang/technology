package day02.com.atduigu.java8;

public class SubClass extends MyClass implements MyFun, MyInterface {
    @Override
    public String getName() {
        return MyInterface.super.getName();
    }
}
