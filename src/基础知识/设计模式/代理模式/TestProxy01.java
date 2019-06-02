package 基础知识.设计模式.代理模式;

public class TestProxy01 {
    public static void main(String[] args) {
        // 目标对象
        UserImpl sd = new UserImpl();
        // 代理对象
        User hsw = new UserImpl2();
        // 建立连接
        hsw.saveUser("");
    }
}
