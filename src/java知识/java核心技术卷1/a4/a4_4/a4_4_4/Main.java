package java知识.java核心技术卷1.a4.a4_4.a4_4_4;

import java.text.NumberFormat;

/**
 * @Description: 工厂方法
 * @author: Gao Hang Hang
 * @date 2018/12/08 8:56 PM
 */
public class Main {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // prints $0.10
        System.out.println(percentFormatter.format(x)); // prints 10%
    }
}
