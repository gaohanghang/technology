package 基础知识.设计模式.原型模式.my;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:11
 **/
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
