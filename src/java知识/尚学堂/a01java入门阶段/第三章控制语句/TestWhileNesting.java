package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * 测试嵌套循环
 * 在一个循环语句内部再嵌套一个或多个循环，称为嵌套循环。
 * while、do-while与for循环可以任意嵌套多层。
 *
 * @author: Gao HangHang
 * @date 2018/11/04
 */
public class TestWhileNesting {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }


        System.out.println("###################");
        //打印99乘法表
        for (int n = 1; n <= 9; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(m + "*" + 2 + "=" + (m * 2) + "\t");
            }
            System.out.println();
        }

        System.out.println("###################");
        //用while循环分别计算100以内的奇数及偶数的和，并输出
        int sum01 = 0;
        int sum02 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {//偶数
                sum01 += i;
            } else {//奇数
                sum02 += i;
            }
        }
        System.out.println("奇数和：" + sum01);
        System.out.println("偶数和：" + sum02);

        //用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
        int h = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                h++;
            }
            if (h == 5) {
                System.out.println();
                h = 0;
            }

           /* if (i%25==0){
                System.out.println();
            }*/
        }
    }
}
