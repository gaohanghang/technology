package 基础知识.Java基础.值传递和引用传递;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/28 15:35
 */
public class Example {
    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str+ " and ");
        System.out.print(ex.ch);
    }
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }
}
