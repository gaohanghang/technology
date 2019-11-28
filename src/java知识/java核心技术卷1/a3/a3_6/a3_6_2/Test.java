package java知识.java核心技术卷1.a3.a3_6.a3_6_2;

/**
 * @Description: 拼接
 * @author: Gao Hang Hang
 * @date 2018/11/26 7:56 PM
 */
public class Test {
    public static void main(String[] args) {
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);

        String answer = "";
        System.out.println("The answer is " + answer);

        String all = String.join("/", "S", "M", "L", "XL");
        System.out.println(all);
    }
}
