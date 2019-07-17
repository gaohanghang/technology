package java知识.公众号.占小狼的博客.a2019.a7_11.chain_of_responsibility;

/**
 * @Description 拼写检查处理
 * @Author Gao Hang Hang
 * @Date 2019-07-13 01:47
 **/
public class SpellCheckerProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return input.replace("labda", "lambda");
    }
}
