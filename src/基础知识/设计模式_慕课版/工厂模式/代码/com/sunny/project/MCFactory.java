package 基础知识.设计模式_慕课版.工厂模式.代码.com.sunny.project;

public class MCFactory implements PersonFactory {

    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
