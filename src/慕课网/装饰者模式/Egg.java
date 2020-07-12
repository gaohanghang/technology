package 慕课网.装饰者模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 19:53
 **/
public class Egg extends Decorator{

    public Egg(Drink drink) {
        super(drink);
    }

    @Override
    public double money() {
        return super.money() + 3.9;
    }

    @Override
    public String desc() {
        return super.desc() + "+鸡蛋";
    }
}
