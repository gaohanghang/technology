package 基础知识.Java基础.关键字.finalTest;

/**
 * 写 final 域的重排序规则，读 final 域的重排序规则
 */
public class FinalExample {

    int i;                            // 普通变量
    final int j;                      //final 变量
    static FinalExample obj;

    public FinalExample() {     // 构造函数
        i = 1;                        // 写普通域
        j = 2;                        // 写 final 域
    }

    public static void writer() {    // 写线程 A 执行
        obj = new FinalExample();
    }

    public static void reader() {       // 读线程 B 执行
        FinalExample object = obj;       // 读对象引用
        int a = object.i;                // 读普通域
        int b = object.j;                // 读 final 域
    }

    public static void main(String[] args) {

        //new Thread(FinalExample::writer).start();

        new Thread(FinalExample::reader).start();

    }
}
