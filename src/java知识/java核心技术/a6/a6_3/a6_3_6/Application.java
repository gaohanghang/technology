package java知识.java核心技术.a6.a6_3.a6_3_6;

import java.awt.event.ActionListener;

/**
 * 在一个 lambda 表达式中使用 this 关键字时，是指创建这个 lambda 表达式的方法的 this 参数。
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/25 17:18
 */
public class Application {
    public void init() {
        ActionListener listener = event -> {
            System.out.println(this.toString());
        };
    }
}
