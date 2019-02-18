package java知识.公众号.芋道源码.a2019_2_4;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/02/04 12:52
 */
public class SimpleFacoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("BMW");
        System.out.println(car.getName());

        Factory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.getCar().getName());
        Factory benzFactory = new BenzFactory();
        System.out.println(benzFactory.getCar().getName());


    }
}
