package java知识.java核心技术.a3.a3_7.a3_7_2;

import java.util.Date;

/**
 * @Description: 格式化输出
 * @author: Gao Hang Hang
 * @date 2018/11/30 8:09 PM
 */
public class Test {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;

        //System.out.print(x);

        //System.out.printf("%8.2f", x);

        //System.out.printf("Hello, %s , Next year, you'll be %d", "Gao hang hang" , 22);

        //System.out.printf("%,2f", 10000.0 / 3.0);

        //System.out.printf("Hello, %s, Next year, you'll be %d","Gao hang hang",18);

        //System.out.printf("%tc", new Date());

        //System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());

        System.out.printf("%s %tB %<te, %<tY", "Due date:" + new Date());
        ;
    }
}
