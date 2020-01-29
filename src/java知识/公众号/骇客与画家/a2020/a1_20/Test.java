package java知识.公众号.骇客与画家.a2020.a1_20;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-01-20 19:53
 **/
public class Test {

    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();

        Thread t1 = new Thread(printNum);
        Thread t2 = new Thread(printNum);

        t1.setName("甲");
        t2.setName("乙");

        t1.start();
        t2.start();
    }

}
