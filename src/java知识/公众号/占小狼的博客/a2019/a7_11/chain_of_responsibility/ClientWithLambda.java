package java知识.公众号.占小狼的博客.a2019.a7_11.chain_of_responsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-13 01:55
 **/
public class ClientWithLambda {

    public static void main(String[] args) {
        UnaryOperator<String> headerProcessing = (String text) -> "From Ranoul, Mario and ALan: " +
                text;

        UnaryOperator<String> spellCheckProcessing = (String text) -> text.replace("labda", "lambda");

        Function<String, String> function = headerProcessing.andThen(spellCheckProcessing);

        String result = function.apply("Aren't labdas really sexy?!!");
        System.out.println(result);

        UnaryOperator<String> hhhhhProcessing = (String text) -> text.concat("hhhh");
        Function<String, String> function1 = function.andThen(hhhhhProcessing);
        String result1 = function1.apply("Aren't labdas really sexy?!!");
        System.out.println(result1);
    }
}
