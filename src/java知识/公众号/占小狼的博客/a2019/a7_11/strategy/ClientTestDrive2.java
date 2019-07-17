package java知识.公众号.占小狼的博客.a2019.a7_11.strategy;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 18:50
 **/
public class ClientTestDrive2 {

    public static void main(String[] args) {
        Validator numbericValidator = new Validator((String s) -> s.matches("\\d+"));
        boolean res1 = numbericValidator.validate("7789");
        System.out.println(res1);

        Validator lowerCaseValidator = new Validator((String s) -> s.matches("[a-z]+"));
        boolean res2 = lowerCaseValidator.validate("aaaddd");
        System.out.println(res2);
    }
}
