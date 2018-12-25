package 基础知识.Java基础.面向对象.多态;

/**
 * 需求1： 笔记本电脑运行。
 * <p>
 * 需求2：在笔记本电脑上使用鼠标。
 * 描述鼠标。并在笔记本电脑类中加入使用鼠标的功能
 *
 * @author GaoHangHang
 * @date 2018/07/21 21:11
 **/
/*
class NoteBook {
    public void run(){
        System.out.println("notebook run");
    }
    public void useMouse(Mouse m){
        m.open();
        m.close();
    }
}

//描述鼠标。
class Mouse{
    void open(){
        System.out.println("mouse open");
    }
    void close(){
        System.out.println("mouse close");
    }
}
*/


/*
需求3：想在笔记本电脑上除了使用鼠标，还想使用pc键盘。
描述键盘，在笔记本电脑类中定义一个使用键盘方法。
不要写代码了，怂！后期每使用一个设备，就要更改笔记本电脑代码，不利于扩展。
所以在需求2的时候，就应该思考这个问题。因为鼠标无非就是外围设备中的一种。
 */

/*
重新分析需求：
笔记本电脑运行，后期有可能会使用外围设备。

笔记本如何去使用外围设备呢？外围设备不确定。
所以笔记本无法确定要使用什么设备。还要留有扩展。
那就需要降低笔记本和外围设备之间的耦合性。

可以先定义规则。规则在java的体现就是接口。

笔记本只需要使用这个接口。后期的外围设备只需要符合（实现）这个接口即可。
比如可以定义一个USB接口。

接口降低了耦合性
 */
//描述规则。
interface USB {
    public void open();

    public void close();
}

//描述笔记本电脑
class NoteBook {
    public void run() {
        System.out.println("notebook run");
    }

    //定义一个使用usb规则的功能。
    public void useUSB(USB usb) {//USB usb = new Mouse();
        if (usb != null) {
            usb.open();
            usb.close();
        }
    }
}

//买了个鼠标。别忘了，一定要买符合规则的。
class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");
    }
}

//买一个pc键盘
class KeyBoard implements USB {

    @Override
    public void open() {
        System.out.println("KEY open");
    }

    @Override
    public void close() {
        System.out.println("KEY close");
    }
}

class NoteBookTest {
    public static void main(String[] args) {
        NoteBook book = new NoteBook();
        book.run();
        book.useUSB(null);
        book.useUSB(new Mouse());
        book.useUSB(new KeyBoard());

//        NoteBook book = new NoteBook();
//        book.run();
//        book.useMouse(new Mouse());
    }
}