package 基础知识.设计模式.适配器模式;

/**
 * @Description 使用适配器的客户端
 * @Author Gao Hang Hang
 * @Date 2019-05-18 10:51
 **/
public class Client {
    public static void main(String[] args) {
        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        // 创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        // 请求处理
        target.request();
    }
}
