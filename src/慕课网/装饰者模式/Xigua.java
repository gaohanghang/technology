package 慕课网.装饰者模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 20:01
 **/
public class Xigua extends Decorator{

    public Xigua(Drink drink) {
        super(drink);
    }

    @Override
    public double money() {
        return super.money() + 4.0;
    }

    @Override
    public String desc() {
        return super.desc() + "+西瓜";
    }
}
