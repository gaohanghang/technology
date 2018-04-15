package 基础知识.图解设计模式.第21章_Proxy模式;

public class Printer {
    private String name;
    //构造函数
    public Printer(){
        heavyJob("正在生成 Printer 的实例");
    }
    //设置名字
    public void setPrinterName(String name){
        this.name = name;
    }
    //获取名字
    public String getPrintName(){
        return name;
    }
    //显示带打印机名字的文字
    public Printer(String name){
        System.out.println("=== "+ name + "===");
    }
    //重活
    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("结束。");
    }

}
