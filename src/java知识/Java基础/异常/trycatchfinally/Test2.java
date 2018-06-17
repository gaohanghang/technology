package java知识.Java基础.异常.trycatchfinally;

/**
 * 此外，如果try-catch-finally中都有return，那么finally块中的return将会覆盖别处的return语句
 * ，最终返回到调用者那里的是finally中return的值。
 *
 * return语句并不一定都是函数的出口，执行return时，只是把return后面的值复制了一份到返回值变量里去了。
 *
 * 结果
 * execute finally
 * 3
 * @author GaoHangHang
 * @date 2018/06/17 20:55
 **/
public class Test2 {
    public static int testFinally() {
        try{
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            System.out.println("execute finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        int result = testFinally();
        System.out.println(result);
    }
}
