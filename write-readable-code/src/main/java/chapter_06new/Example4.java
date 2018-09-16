package main.java.chapter_06new;

/**
 * 为代码中的瑕疵写注释
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example4 {

    /**
     * TODO 优化算法的性能
     */
    public void foo() {

    }

    public void bar(String suffix) {
        if ("jpg".equals(suffix)) {
            System.out.println(suffix);
        } else {
            // TODO 处理 jpg 之外的其他格式
        }
    }


}
