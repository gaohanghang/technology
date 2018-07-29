package 基础知识.Java基础.面向对象.多态;

/**
 * 多态
 * 某一事物的多种体现形态。
 * 重点是对象的多态性。
 *
 * class 动物
 * {}
 *
 * class 猫 extends 动物
 *  {}
 *
 *  //猫 x = new 猫();
 *  动物 x = new 猫();多态
 *
 *  多态在程序中的体现：父类或接口的引用指向自己的子类对象。
 *  一个对象具有两种形态 即是猫也是动物
 *
 *  多态的好处：提高了代码的扩展性，后期出现的功能，可以被之前的程序所执行。
 *
 *  多态的弊端：虽然可以使用后期出现的代码，但是不能使用子类特有的功能，只能使用覆盖了父类的功能。
 *
 *  多态的前提：必须要有关系（继承，实现），通常会有覆盖操作。
 *
 * class
 * @author GaoHangHang
 * @date 2018/07/21 17:38
 **/
abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    void eat() {
        System.out.println("吃鱼");
    }
    void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("啃骨头");
    }
    void lookHome(){
        System.out.println("看家");
    }
}

class DuoTaiDemo {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.eat();
        //多态
//        Animal a = new Cat();
//        a.eat();

        methos(new Cat());
        methos(new Dog());
    }
    public static void methos(Animal a){
        a.eat();
    }
    /*public static void method(Cat c){
        c.eat();
    }
    public static void method(Dog d){
        d.eat();
    }*/
}

class DuoTaiDemo2{
    public static void main(String[] args) {
        Animal a = new Cat();//向上转型。什么时候用？需要提高程序的扩展性，隐藏具体子类型时。
        a.eat();

        //向下转型前，必须对具体对象进行类型的判断，判断的关键字的 instanceof为了避免运行时出现ClassCastExcepton

        if (a instanceof Cat){
            Cat c = (Cat) a;//向下转型。什么时候用？当需要使用子类型的特有方法时。
            c.eat();
            c.catchMouse();
        }

    }
}

class 毕姥爷 {
    void 讲课(){
        System.out.println("管理");
    }
    void 钓鱼(){
        System.out.println("钓鱼");
    }
}

class 毕老师 extends 毕姥爷{
    void 讲课(){
        System.out.println("java");
    }
    void 看电影(){
        System.out.println("看电影");
    }
}

class DuoTaiDemo3{
    public static void main(String[] args) {
        //向上转型
        毕姥爷 x = new 毕老师();
        x.讲课();
        x.钓鱼();
        //x.看电影;//不行，因为毕姥爷没有方法。

        //向下转型
        毕老师 y = (毕老师) x;
        y.看电影();

        //多态自始至终都是子类对象在做着类型的变化。
    }
}
