package 慕课网.装饰者模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 19:46
 **/
public abstract class Decorator implements Drink{

    // 装饰器
    // 1.抽象类
    // 2.实现抽象类组件接口
    // 3.持有抽象接口的引用

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double money() {
        return drink.money();
    }

    @Override
    public String desc() {
        return drink.desc();
    }

}
