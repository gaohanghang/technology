package java知识.公众号.芋道源码.a2019_2_4.抽象工程模式;

import java知识.公众号.芋道源码.a2019_2_4.BMWFactory;
import java知识.公众号.芋道源码.a2019_2_4.BenzFactory;
import java知识.公众号.芋道源码.a2019_2_4.Car;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/02/04 12:58
 */
public abstract class AbstractFactory {

    protected abstract Car getCar();

    //这段代码就是动态配置的功能
    //固定模式的委派
    public Car getCar(String name) {
        if ("BMW".equalsIgnoreCase(name)) {
            return new BMWFactory().getCar();
        } else if ("Benz".equalsIgnoreCase(name)) {
            return new BenzFactory().getCar();
        } else {
            System.out.println("这个产品产不出来");
            return null;
        }
    }
}
