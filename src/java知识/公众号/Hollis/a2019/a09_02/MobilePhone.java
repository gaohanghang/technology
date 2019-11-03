package java知识.公众号.Hollis.a2019.a09_02;

/**
 * @Description https://www.jianshu.com/p/f32e99e64c1c
 * @Author Gao Hang Hang
 * @Date 2019-11-03 23:45
 **/
public class MobilePhone {

    /*
       1. 组合就是 A类的对象是B类的成员变量。相当于 A类对象是B类对象的一个变量，A类中的所有功能，B类都可以通过A类对象的调用来实现。
       2. 组合体现的是整体与部分、拥有的关系，即 has - a 的关系
     */

    // 电池
    private Battery dc;
    // 屏幕
    private Screen pm;
    // CPU
    private CPU cpu;

    MobilePhone(Battery dc, Screen pm, CPU cpu) {
        this.dc = dc;
        this.pm = pm;
        this.cpu = cpu;
    }

    /**
     * 开机
     */
    public void boot() {

        // 电池放电
        dc.discharge();
        // cpu运算
        cpu.mathematical();
        // 屏幕亮屏
        pm.brightScreen();

        System.out.println("开机成功");
    }

    public static void main(String[] args) {

        Battery dc = new Battery();
        Screen pm = new Screen();
        CPU cpu = new CPU();

        MobilePhone sj = new MobilePhone(dc, pm, cpu);
        sj.boot();

    }

}
