package 基础知识.图解设计模式.第3章TeamplateMethod模式;

/**
 * @author: Gao HangHang
 * @date 2018/10/26
 */
public class CharDisplay extends AbstractDisplay{  // CharDisplay是 AbstractDisplay 的子类
    private char ch;                   // 需要显示的字符
    public CharDisplay(char ch) {      // 构造函数中接收的字符被
        this.ch = ch;                  // 保存在字段中
    }

    @Override
    public void open() {               // open 在父类中是抽象方法
                                       // 此处重写该方法
        System.out.println("<<");      // 显示开始字符 "<<"
    }

    @Override
    public void print() {              // 同样的，此处重写 print 方法
                                       // 该方法会在 display 中重复调用
        System.out.println(ch);        // 显示保存在字段 ch 中的字符
    }

    @Override
    public void close() {              // 同样地，此处重写 close 方法
        System.out.println(">>");      // 显示结束字符 ">>"
    }

}
