package 基础知识.Java基础.值传递和引用传递;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-08-27 16:16
 **/
public class RefDemo03 {

    public static void main(String[] args) {
        // String 是不可变的类
        String str = "张三";
        call(str);
        System.out.println(str);
    }

    public static void call(String i) {
        i = "李四";
    }

}
