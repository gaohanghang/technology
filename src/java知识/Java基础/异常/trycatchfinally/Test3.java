package java知识.Java基础.异常.trycatchfinally;

/**
 * try/catch中有return,在finally{}中改变基本数据类型、
 * 引用类型对运行结果的影响
 *
 * 运行结果
 * execute testFinally1
 * 1
 * execute testFinally2
 * helloworld
 *
 * 程序在执行到return时会先将返回值存储在一个指定位置，其次去执行finally块，最会再return。
 *
 * 在finally块中改变基本类型的数据result1/引用类型数据result2的值，与java的值传递和引用传递相关。
 * 值传递中，形参和实参有着不同的存储单元，对形参的改变不会影响实参的值；
 * 引用传递中，传递的是对象的地址，形参和实参的对象指向同一块存储单元对形参的改变就会影响实参的值。
 *
 * 作者：AmorFatiYJ
 * 链接：https://www.jianshu.com/p/06755f52ba90
 * 來源：简书
 * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
 *
 * @author GaoHangHang
 * @date 2018/06/17 21:04
 **/
public class Test3 {
    public static int testFinally1() {
        int result1 = 1;
        try {
            return result1;
        } catch (Exception ex) {
            result1 = 2;
            return result1;
        } finally {
            result1 = 3;
            System.out.println("execute testFinally1");
        }
    }
    public static StringBuffer testFinally2() {
        StringBuffer result2 = new StringBuffer("hello");
        try {
            return result2;
        } catch (Exception ex) {
            return null;
        } finally {
            result2.append("world");
            System.out.println("execute testFinally2");
        }
    }

    public static void main(String[] args) {
        int test1 = testFinally1();
        System.out.println(test1);
        StringBuffer test2 = testFinally2();
        System.out.println(test2);
    }
}
