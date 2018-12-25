package java知识.尚学堂.javase;

/**
 * @author GaoHangHang
 * @date 2018/08/25 10:24
 **/
public class TestException {
    public static void main(String[] args) {
        //int i = 1/0;
        //Computer c = null;
        //if (c!=null){
        //    c.start();    //对象是null，调用了对象或属性！
        //}

        //Scanner s = new Scanner(System.in);
        //int a = s.nextInt();
        //System.out.println(a);

        //String str = "1234abcf";
        //Integer i = new Integer(str);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Computer {
    void start() {
        System.out.println("计算机启动！");
    }
}
