package java知识.知识星球.直面java.a72什么是异常链;

import java.io.FileNotFoundException;

/**
 * 一种面向对象的编程技术，将捕获到的异常重新封装到一个新的异常中，并重新抛出。
 * 作用是可以保留每一层的异常信息，用户查看异常的时候，能够从顶层异常信息看到底层异常信息。
 * <p>
 * 异常信息的传递
 * “异常链”是Java中非常流行的异常处理概念，是指在进行一个异常处理时抛出了另外一个异常，由此产生了一个异常链条。
 * 该技术大多用于将“ 受检查异常” （ checked exception）封装成为“非受检查异常”（unchecked exception)或者RuntimeException。
 * 顺便说一下，如果因为因为异常你决定抛出一个新的异常，你一定要包含原有的异常，
 * 这样，处理程序才可以通过getCause()和initCause()方法来访问异常最终的根源。
 *
 * @author GaoHangHang
 * @date 2018/06/17 19:30
 **/
public class TestChainedException {
    public static void main(String[] args) {
        //throw original exception 抛出原始异常
        try {
            throw new FileNotFoundException("oops,no file");
        } catch (Exception ex) {
            /*
                catch exception and make it into a new exception as member param cause.
                捕获异常并将其作为参数放到新异常中。
             */
            ex.printStackTrace();
            throw new RuntimeException(ex);

        }
    }
}
