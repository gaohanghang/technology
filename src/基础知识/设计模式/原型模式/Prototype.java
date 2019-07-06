package 基础知识.设计模式.原型模式;

/**
 * @Description 抽象原型角色
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:06
 **/
public abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象。
     */
    public abstract Prototype clone();
}
