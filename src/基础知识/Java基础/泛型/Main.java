package 基础知识.Java基础.泛型;

import java.util.ArrayList;

/**
 * @author GaoHangHang
 * @date 2018/07/12 21:49
 **/


/*
Java 中，数组是协变的，即 Integer extends Number，那么子类数组实例是可以赋值给父类数组实例的。那是由于 Java 中的数组类型本质上会由虚拟机运行时动态生成一个类型，这个类型除了记录数组的必要属性，如长度，元素类型等，会有一个指针指向内存某个位置，这个位置就是该数组元素的起始位置。



所以子类数组实例赋值父类数组实例，只不过意味着父类数组实例的引用指向堆中子类数组而已，并不会有所冲突，因此是 Java 允许这种操作的。



而泛型是不允许这么做的，为什么呢？



我们假设泛型允许这种协变，看看会有什么问题。



ArrayList<Integer> integers = new ArrayList<>();

ArrayList<Number> numbers = new ArrayList<>();

numbers = integers;//假设的前提下，编译器是能通过的

numbers.add(23.5);



假设 Java 允许泛型协变，那么上述代码在编译器看来是没问题的，但运行时就会出现问题。这个 add 方法实际上就将一个浮点数放入了整型容器中了，虽然由于类型擦除并不会对程序运行造成问题，但显然违背了泛型的设计初衷，容易造成逻辑混乱，所以 Java 干脆禁止泛型协变。



所以虽然 ArrayList<Integer> 和 ArrayList<Number> 编译器类型擦除之后都是 ArrayList 的实例，但是起码在编译器看来，这两者是两种不同的类型。
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integerArr = new Integer[2];
        Number[] numberArr = new Number[2];
        numberArr = integerArr;

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        //numbers = integers;//编译不通过
    }
}
