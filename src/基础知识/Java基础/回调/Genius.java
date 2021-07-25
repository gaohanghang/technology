package 基础知识.Java基础.回调;

public class Genius {
    public void answer(CallBack callBack) {
        System.out.println("在忙其他事...");
        try {
            Thread.sleep(2000);
            System.out.println("忙完其他事，开始计算...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("天才计算出答案为：2");
        // 回调告诉你
        callBack.callback("2");
    }

    public static void main(String[] args) {
        Genius genius = new Genius();
        Person you = new Person(genius);
        you.ask();
    }
}
