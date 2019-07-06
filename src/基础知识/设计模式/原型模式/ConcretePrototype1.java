package 基础知识.设计模式.原型模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:07
 **/
public class ConcretePrototype1 extends Prototype{

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
