package 基础知识.设计模式.原型模式.my;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:12
 **/
public class ConcretePrototype2 implements Prototype {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2 [name=" + name + "]";
    }
}
