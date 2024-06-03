package java核心技术卷1.a3.a3_10.a3_10_4;

/**
 * @Description: 命令行参数
 * @author: Gao Hang Hang
 * @date 2018/12/04 10:48 PM
 */
public class Message {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
        //print the other command-line arguments
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");
    }
}

