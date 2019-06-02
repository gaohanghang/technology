package 基础知识.设计模式.适配器模式;

/**
 * @Description 适配器类
 * @Author Gao Hang Hang
 * @Date 2019-05-18 10:47
 **/
public class Adapter implements Target {

    // 持有需要被适配的接口对象
    private Adaptee adaptee;

    /*
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
