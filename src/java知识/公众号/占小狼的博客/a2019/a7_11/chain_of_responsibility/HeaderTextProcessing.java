package java知识.公众号.占小狼的博客.a2019.a7_11.chain_of_responsibility;

/**
 * @Description 标题文本处理
 * @Author Gao Hang Hang
 * @Date 2019-07-13 01:45
 **/
public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String input) {
        return "From Ranoul, Mario and ALan: " + input;
    }
}
