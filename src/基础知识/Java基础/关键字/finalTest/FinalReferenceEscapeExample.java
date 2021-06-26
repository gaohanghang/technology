package 基础知识.Java基础.关键字.finalTest;

public class FinalReferenceEscapeExample {
    final int i;
    static FinalReferenceEscapeExample obj;

    public FinalReferenceEscapeExample() {
        i = 1;                              //1 写 final 域
        obj = this;                          //2 this 引用在此“逸出”
    }

    public static void writer() {
        new FinalReferenceEscapeExample();
    }

    public static void reader() {
        if (obj != null) {                     //3
            int temp = obj.i;                 //4
        }
    }

    public static void main(String[] args) {

        new Thread(() -> {

        }).start();
    }
}
