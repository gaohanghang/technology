package 基础知识.设计模式达内.代理模式.静态代理实现;

public class HelloServiceProxy implements HelloService {
    // has a (有一个)
    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void sayHello(String msg) {
        System.out.println("method.start:" + System.nanoTime());
        // 核心业务
        helloService.sayHello(msg);
        System.out.println("method.start:" + System.nanoTime());
    }

}
