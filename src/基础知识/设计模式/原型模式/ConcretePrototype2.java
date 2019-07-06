package 基础知识.设计模式.原型模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:08
 **/
public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String id) {
        super(id);
    }

    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2(this.getId());
        return prototype;
    }
}
