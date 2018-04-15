package 基础知识.图解设计模式.第5章_Singleton_模式.代码.A5_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
