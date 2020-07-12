package 慕课网.装饰者模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 20:03
 **/
public class Fruit implements Drink{

    @Override
    public double money() {
        return 6;
    }

    @Override
    public String desc() {
        return "果汁";
    }
}
