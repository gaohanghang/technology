package 基础知识.设计模式_慕课版.工厂模式.代码.com.sunny.project;

/**
 * 模拟客户端的实现
 */
public class SunnyTest {

    public static void main(String[] args) {

//        HairInterface left = new LeftHair();
//        left.draw();

        HairFactory factory = new HairFactory();
//        HairInterface left = factory.getHair("left");
//        left.draw();

//        HairInterface left = factory.getHairByClass("com.sunny.project.LeftHair");
//        left.draw();

//        HairInterface hair = factory.getHairByClassKey("in");
//        hair.draw();

//        PersonFactory facoty = new MCFactory();
//        Girl girl = facoty.getGirl();
//        girl.drawWomen();

        PersonFactory facoty = new HNFactory();
        Boy boy = facoty.getBoy();
        boy.drawMan();
    }
}
