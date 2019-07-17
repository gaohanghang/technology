package java知识.公众号.占小狼的博客.a2019.a7_11.strategy;

/**
 * @Description 全是小写
 * @Author Gao Hang Hang
 * @Date 2019-07-12 18:38
 **/
public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
