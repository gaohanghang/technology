package java知识.公众号.Hollis.a2019.a09_02.father;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-11-03 23:56
 **/
public class InheritTest {

    /*
        1. 一个类继承另外的一个类的功能，并可以增加它自己的新功能的能力
        2. 继承体现的是父与子，血缘的关系，即 is-a 的关系
     */

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.breath();
        bird.fly();

        Wolf wolf = new Wolf();
        wolf.beat();
        wolf.run();
    }

}
