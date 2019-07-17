package java知识.公众号.占小狼的博客.a2019.a7_11.chain_of_responsibility;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-13 01:50
 **/
public class Client {

    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);

        String result = p1.handler("Aren't labdas really sexy?!!");
        System.out.println(result);
    }
}
