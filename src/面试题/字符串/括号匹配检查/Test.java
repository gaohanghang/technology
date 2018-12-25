package 面试题.字符串.括号匹配检查;

/**
 * @author GaoHangHang
 * @date 2018/06/04 11:16
 **/
public class Test {
    public static void main(String[] args) {
        String s = "xXccxxxXX";
        // 从头开始查找是否存在指定的字符         //结果如下
        System.out.println(s.indexOf("c"));     //2
        // 从第四个字符位置开始往后继续查找，包含当前位置
        System.out.println(s.indexOf("c", 3));  //3
        // 若指定字符串中没有该字符则系统返回-1
        System.out.println(s.indexOf("y"));     //-1
        System.out.println(s.lastIndexOf("x")); //6
    }

    private static void testIndexOf() {
        String string = "aaa456ac";

        //查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.
        System.out.println(string.indexOf("b"));//indexOf(String str)；返回结果：-1，"b"不存在

        // 从第四个字符位置开始往后继续查找，包含当前位置
        System.out.println(string.indexOf("a", 3));//indexOf(String str, int fromIndex)；返回结果：6

        //（与之前的差别：上面的参数是 String 类型，下面的参数是 int 类型）参考数据：a-97,b-98,c-99

        // 从头开始查找是否存在指定的字符
        System.out.println(string.indexOf(99));//indexOf(int ch)；返回结果：7
        System.out.println(string.indexOf('c'));//indexOf(int ch)；返回结果：7

        //从fromIndex查找ch，这个是字符型变量，不是字符串。字符a对应的数字就是97。
        System.out.println(string.indexOf(97, 3));//indexOf(int ch, int fromIndex)；返回结果：6
        System.out.println(string.indexOf('a', 3));//indexOf(int ch, int fromIndex)；返回结果：6

        //这个就是灵活运用String类提供的方法，拆分提供的字符串。
        //String s = "D:\\Android\\sdk\\add-ons";
        //System.out.println(s);
        //while (s.lastIndexOf("\\") > 0) {
        //    s = s.substring(0, s.lastIndexOf("\\"));
        //    System.out.println(s);
        //}
    }
}
