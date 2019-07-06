package 基础知识.设计模式.原型模式.my;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:11
 **/
public class ConcretePrototype1 implements Prototype {
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
        Prototype prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1 [name=" + name + "]";
    }

}
