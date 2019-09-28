package java知识.公众号.Java技术栈.a2019.a9_16;

/**
 * @Description 不指定类型
 * @Author Gao Hang Hang
 * @Date 2019-09-17 20:37
 **/
public class noSpecifyType {
    public static void main(String[] args) {
        GlmapperGeneric glmapperGeneric = new GlmapperGeneric();
        glmapperGeneric.set("test");
        // 不指定类型，需要强制类型转换
        String test = (String) glmapperGeneric.get();
        System.out.println(test);
    }

}
