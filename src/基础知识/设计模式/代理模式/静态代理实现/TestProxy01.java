package 基础知识.设计模式.代理模式.静态代理实现;

public class TestProxy01 {
    public static void main(String[] args) {
        // 目标对象
        HelloService helloService = new HelloServiceImpl();
        // 代理对象(扩展的类)
        HelloService helloServiceProxy = new HelloServiceProxy(helloService);
        // 建立关系
        helloServiceProxy.sayHello("CGB 枢枢");
    }
}
