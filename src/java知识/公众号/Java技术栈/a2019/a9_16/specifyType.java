package java知识.公众号.Java技术栈.a2019.a9_16;

/**
 * @Description 指定类型
 * @Author Gao Hang Hang
 * @Date 2019-09-17 20:39
 **/
public class specifyType {
    public static void main(String[] args) {
        GlmapperGeneric<String> glmapperGeneric = new GlmapperGeneric<>();
        glmapperGeneric.set("test");
        // 不需要强制类型转换
        String test = glmapperGeneric.get();
        System.out.println(test);
    }
}
