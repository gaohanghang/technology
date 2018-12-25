package 基础知识.设计模式_慕课版.工厂模式.代码.com.sunny.project;

/**
 * 人物的实现接口
 *
 * @author ghang
 */
public interface PersonFactory {

    //男孩接口
    public Boy getBoy();

    //女孩接口
    public Girl getGirl();

}
