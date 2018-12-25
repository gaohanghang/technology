package 基础知识.图解设计模式.第5章_Singleton_模式.代码.A5_1;


public class TicketMaker {
    private int ticket = 1000;

    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
