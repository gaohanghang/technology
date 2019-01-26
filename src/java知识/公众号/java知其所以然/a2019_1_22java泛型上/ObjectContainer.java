package java知识.公众号.java知其所以然.a2019_1_22java泛型上;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/26 20:08
 */
// 根据这个代码来看，泛型类型就是 T。泛型类型也可以称为泛型形参。
public class ObjectContainer<T> {
    public Object obj;

    public static void main(String[] args) {
        // ObjectContainer myObj = new ObjectContainer();
        // // 这里发生向上转型
        // myObj.obj = "Test";
        // String  myStr = (String) myObj.obj;
        // System.out.println("myStr" + myStr);

        // 执行泛型类型调用分配 String 这个具体类型，String 也可以成为泛型实参。
        ObjectContainer<String> myObj = new ObjectContainer<>();
        myObj.obj = "ypf";
        // 这里不需要类型转型，因为通过执行泛型类型调用分配了 String 这个类型，编译器会帮
    }
}
