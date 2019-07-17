package java知识.公众号.占小狼的博客.a2019.a7_11.strategy;

/**
 * @Description 是数字的
 * @Author Gao Hang Hang
 * @Date 2019-07-12 18:39
 **/
public class IsNumberic implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
