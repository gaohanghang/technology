package 基础知识.设计模式_慕课版.工厂模式.代码.com.sunny.project;

/**
 * 右偏分发型
 */
public class RightHair implements HairInterface {
    /**
     * 画了一个左偏分发型
     */
    @Override
    public void draw() {
        System.out.println("-----------右偏分发型----------------");
    }
}
