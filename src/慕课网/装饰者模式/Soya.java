package 慕课网.装饰者模式;

/**
 * @Description 纯豆浆
 * @Author Gao Hang Hang
 * @Date 2020-07-12 19:45
 **/
public class Soya implements Drink{

    // 被装饰者
    @Override
    public double money() {
        return 5.0;
    }

    @Override
    public String desc() {
        return "纯豆浆";
    }

}
