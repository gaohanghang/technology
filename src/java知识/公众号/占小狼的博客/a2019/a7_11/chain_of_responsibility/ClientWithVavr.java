package java知识.公众号.占小狼的博客.a2019.a7_11.chain_of_responsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-13 02:08
 **/
public class ClientWithVavr {

    public static void main(String[] args) {
        Function<String,String> headerProcessing = (String text) -> "From Ranoul, Mario and ALan: " +
                text;

        Function<String,String> spellCheckProcessing = (String text) -> text.replace("labda", "lambda");;

        Function<String, String> function = headerProcessing.compose(spellCheckProcessing);

        String result = function.apply("Aren't labdas really sexy?!!");
        System.out.println(result);
    }
}
