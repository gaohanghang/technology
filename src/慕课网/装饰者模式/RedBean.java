package 慕课网.装饰者模式;

/**
 * @Description 红豆
 * @Author Gao Hang Hang
 * @Date 2020-07-12 19:51
 **/
public class RedBean extends Decorator {


    public RedBean(Drink drink) {
        super(drink);
    }

    // 重写money
    @Override
    public double money() {
        return super.money() + 3.2;
    }

    // 重写品种描述
    @Override
    public String desc() {
        return super.desc() + "+红豆";
    }

}
