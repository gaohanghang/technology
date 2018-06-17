package java知识.Java基础.异常.trycatchfinally;

/**
 * 一、try里有return，finally怎么执行
 *
 * finally块里的代码是在return之前执行的。
 *
 * 在异常处理中，无论是执行try还是catch，finally{}中的代码都会执行（除非特殊情况）。
 * 由于程序执行return就意味着结束对当前函数的调用并跳出这个函数体，因此任何语句要执行都只能在return前执行。
 *
 *  执行结果
 *  execute finally
 * 1
 * @author GaoHangHang
 * @date 2018/06/17 20:51
 **/
public class Test1 {
    public static int testFinally() {
        try{
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            System.out.println("execute finally");
        }
    }

    public static void main(String[] args) {
        int result = testFinally();
        System.out.println(result);
    }
}
