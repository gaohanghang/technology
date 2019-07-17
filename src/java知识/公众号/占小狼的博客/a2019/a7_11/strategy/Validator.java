package java知识.公众号.占小狼的博客.a2019.a7_11.strategy;

/**
 * @Description 为客户提供服务时使用的上下文环境
 * @Author Gao Hang Hang
 * @Date 2019-07-12 18:41
 **/
public class Validator {

    private final ValidationStrategy strategy;


    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
