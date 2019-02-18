package java知识.公众号.芋道源码.a2019_2_4;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/02/04 12:50
 */
public class SimpleFactory {
    public Car getCar(String name) {
        if (name.equals("BMW")) {
            return new BMW();
        } else if (name.equalsIgnoreCase("benz")) {
            return new Benz();
        } else {
            System.out.println("不好意思，这个品牌的汽车生产不了");
            return null;
        }
    }
}
