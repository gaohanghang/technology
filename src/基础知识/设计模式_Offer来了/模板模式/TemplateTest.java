package 基础知识.设计模式_Offer来了.模板模式;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-12-20 08:36
 **/
public class TemplateTest {
    public static void main(String[] args) {
        // 办理取钱流程
        AbstractTemplate template1 = new TakeMoney();
        template1.templateMethod();
        // 办理存储流程
        AbstractTemplate template2 = new SaveMoney();
        template2.handleBusiness();
    }
}
