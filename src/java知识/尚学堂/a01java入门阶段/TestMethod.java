package java知识.尚学堂.a01java入门阶段;

/**
 * 方法就是一段用来完成特定功能的代码片段，类似于其他语言的函数
 * 注意事项
 *
 * 1. 实参的数目、数据类型和次序必须和所调用的方法声明的形式参数列表匹配。
 * 2. return 语句终止方法的运行并指定要返回的数据。
 * 3. Java中进行方法调用中传递参数时，遵循值传递的原则(传递的都是数据的副本)：
 * 4. 基本类型传递的是该数据值的copy值。
 * 5. 引用类型传递的是该对象引用的copy值，但指向的是同一个对象。
 * @author: Gao HangHang
 * @date 2018/11/03
 */
public class TestMethod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printSxt();
        int c = tm.add(30, 40, 50) + 1000;
        System.out.println(c);
    }

    void printSxt() {
        System.out.println("北京");
        System.out.println("上海");
        System.out.println("广州");
    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
        return sum;    //return 两个作用：1.结束方法的运行。2.返回值
    }

}
