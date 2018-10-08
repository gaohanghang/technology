package lesson3;

import java.util.function.Function;

/**
 * 数组引用
 *
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class OtherReference {

    public static void main(String[] args) {
        Function<Integer, String[]> fun  = x -> new String[x];
        String[]                    strs = fun.apply(10);
        System.out.println(strs.length);

        Function<Integer, String[]> fun1 = String[]::new;
        strs = fun1.apply(20);
        System.out.println(strs.length);
    }

}
