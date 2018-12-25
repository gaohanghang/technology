package 基础知识.设计模式达内.代理模式.静态代理实现;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String msg) {
//        System.out.println("method.start:"+System.nanoTime());
        System.out.println("hello " + msg);
//        System.out.println("method.end:"+System.nanoTime());
    }
}
