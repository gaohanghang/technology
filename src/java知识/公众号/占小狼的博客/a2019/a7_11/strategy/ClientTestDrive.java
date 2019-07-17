package java知识.公众号.占小狼的博客.a2019.a7_11.strategy;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 18:46
 **/
public class ClientTestDrive {

    public static void main(String[] args) {
        Validator numberValidator = new Validator(new IsNumberic());
        boolean res1 = numberValidator.validate("7780");
        System.out.println(res1);

        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean res2 = lowerCaseValidator.validate("aaaddd");
        System.out.println(res2);
    }
}
