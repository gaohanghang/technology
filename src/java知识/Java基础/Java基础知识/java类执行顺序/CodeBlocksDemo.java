package java知识.Java基础.Java基础知识.java类执行顺序;

public class CodeBlocksDemo {

    // 静态代码块
    static {
        System.out.println("静态块");
    }

    // 代码块
    {
        System.out.println("代码块");
    }

    // 构造方法
    public CodeBlocksDemo() {
        System.out.println("构造方法");
    }

    // main 方法
    public static void main(String[] args) {

        // 创建第一个实例
        CodeBlocksDemo instance1 = new CodeBlocksDemo();

        // 创建第二个实例
        CodeBlocksDemo instance2 = new CodeBlocksDemo();
    }

    /* 输出结果
    静态块
    代码块
    构造方法
    代码块
    构造方法
     */

}
