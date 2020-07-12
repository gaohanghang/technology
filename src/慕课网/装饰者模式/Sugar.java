package 慕课网.装饰者模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 19:53
 **/
public class Sugar extends Decorator{

    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public double money() {
        return super.money() + 2.1;
    }

    @Override
    public String desc() {
        return super.desc() + "+糖";
    }

}
