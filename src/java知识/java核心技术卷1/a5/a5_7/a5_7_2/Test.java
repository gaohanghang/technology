package java知识.java核心技术卷1.a5.a5_7.a5_7_2;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/21 12:01
 */
public class Test {
    public static void main(String[] args) {
        try {
            String name = ""; // get class name
            Class cl = Class.forName(name);
            // do something with cl
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
