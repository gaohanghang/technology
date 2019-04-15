package java知识.公众号.java基基.a2019.a4_15;

/*
    之所以出现这个编译错误，是因为父类的默认构造方法未定义。在Java中，如果一个类没有定义构造方法，编译器会默认插入一个无参数的构造方法；但是如果一个构造方法在父类中已定义，在这种情况，编译器是不会自动插入一个默认的无参构造方法，这正是以上demo的情况；

    对于子类来说，不管是无参构造方法还是有参构造方法，都会默认调用父类的无参构造方法；当编译器尝试在子类中往这两个构造方法插入super()方法时，因为父类没有一个默认的无参构造方法，所以编译器报错；
 */
class Super {
    String s;

    //public Super() {
    //}

    public Super(String s) {
        this.s = s;
    }
}

//public class Sub extends Super {
//    int x = 200;
//    public Sub(String s) {
//        //super(s);
//    }
//
//    public Sub() {
//        System.out.println("Sub");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


