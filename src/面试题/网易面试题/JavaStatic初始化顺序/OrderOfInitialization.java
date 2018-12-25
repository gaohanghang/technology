package 面试题.网易面试题.JavaStatic初始化顺序;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午5:31
 */
/*
初始化顺序

类内，总是先初始化字段，字段定义的先后顺序决定了初始化的顺序，然后再初始化构造器。
 */
// When the constructor is called to create a
// Window object, you'll see a message:
class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Before constructor

    House() {
        // Show that we're in the constructor:
        System.out.println("House()");

    }

    Window w2 = new Window(2);  // After constructor

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }

}
/* Output:
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
*///:~
