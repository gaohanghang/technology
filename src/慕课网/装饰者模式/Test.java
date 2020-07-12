package 慕课网.装饰者模式;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 19:54
 **/
public class Test {

    public static void main(String[] args) {
        // 开始搭配
        // 创建豆浆对象
        Drink soya = new Soya();
        System.out.println(soya.money());
        System.out.println(soya.desc());
        // 加红糖
        Drink redBeanSoya = new RedBean(soya);
        System.out.println(redBeanSoya.money());
        System.out.println(redBeanSoya.desc());
        // 向红豆豆浆中加入鸡蛋
        Drink erbs = new Egg(redBeanSoya);
        System.out.println(erbs.money());
        System.out.println(erbs.desc());

        // 需要糖豆浆
        Drink ss = new Sugar(soya);
        System.out.println(ss.money());
        System.out.println(ss.desc());

        // 创建西瓜对象
        Drink dd = new Xigua(ss);
        System.out.println(dd.money());
        System.out.println(dd.desc());

        // 搭配果汁
        Drink fr = new Fruit();
        System.out.println(fr.money());
        System.out.println(fr.desc());
        Drink ef = new Egg(fr);
        System.out.println(ef.money());
        System.out.println(ef.desc());
    }

}
