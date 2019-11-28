package java知识.java核心技术卷1.a5.a5_7.a5_7_4;

import java.util.ArrayList;

/**
 * @Description: This program users reflection to spy on objects.
 * 这个程序使用反射来分析对象
 * @author: Gao Hang Hang
 * @date 2018/12/21 15:37
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
