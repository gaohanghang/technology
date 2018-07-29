package 基础知识.Java基础.面向对象.多态;

/**
 * 多态的调用方式在子父类中的特殊体现。
 *
 * 1.成员变量。
 *      多态调用时，编译和运行都参考引用类型变量所属的类中的成员变量。
 *      编译和运行看等号的左边。
 *
 * 2.成员函数
 *      多态调用时，编译参考的引用型变量所属的类，运行时参考的是对象所属的类。
 *      编译看左边，运行看右边。
 *
 * 3，静态函数
 *      多态调用时。编译和运行都参考引用类型变量所属的类中的静态函数。
 *      编译和运行看等号的左边。
 *
 *  成员变量和静态，看左边。
 *  只有非静态函数，编译看左边，运行看右边
 *
 *
 *
 * @author GaoHangHang
 * @date 2018/07/21 20:20
 **/

class Fu{
    //int num = 4;
    void show(){
        System.out.println("fu run");
    }

    static void staticMethod(){
        System.out.println("fu static method");
    }
}

class Zi extends Fu{
    //int num = 5;
    void show(){
        /*
        一般方法可以访问对象中的属性值
        非静态方法运行时和对象绑定在一起
         */
        System.out.println("zi run");
    }

    static void staticMethod(){
        System.out.println("Zi static method");
    }
}

class DuoTaiDemo4 {
    public static void main(String[] args) {

        /*
        静态函数,静态绑定到所属类上。
         */
        Fu.staticMethod();
        Zi.staticMethod();

        /*
        //成员函数。动态绑定到当前对象上
        Fu f = new Zi();
        f.show();*/

       /*
        //成员变量
        Fu f = new Zi();
        Zi z = (Zi)f;
        System.out.println(f.num);
        System.out.println(z.num);*/
    }
}
