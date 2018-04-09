package 基础知识.图解设计模式.第一部分_适应设计模式.第二章_Adapter模式;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();
    }
}
