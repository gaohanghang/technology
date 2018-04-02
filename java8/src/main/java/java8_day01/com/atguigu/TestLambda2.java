package java8_day01.com.atguigu;

import org.junit.Test;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.function.Consumer;

/*
    一、Lambda 表达式的基础语法：Java8中引入了一个新的操作符 "->" 该操作符称为箭头操作符或 Lambda 操作符
                              箭头操作符将 Lambda 表达式拆分成两部分：

    左侧：Lambda 表达式的参数列表
    右侧：Lambda 表达式中所需执行的功能，既 Lambda 体


    语法格式一：无参数，无返回值
        () -> System.out.println("Hello Lambda!");

    语法格式二：有一个参数，并且无返回值
        (x) -> System.out.println(x)

    语法格式三：若只有一个参数，小括号可以省略不谢
        x -> System.out.println(x)

 */
public class TestLambda2 {

    @Test
    public void test1() {
        int num = 0;//jdk 1.7 前，必须是 final

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!"+ num);
            }
        };
        r.run();

        System.out.println("------------------------");

        Runnable r1 = () -> System.out.println("Hello World!");
        r1.run();
    }

    @Test
    public void Consumer(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("我大尚硅谷威武!");
    }

}
