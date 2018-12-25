package 基础知识.Java基础.序列化.test3;

import java.io.Serializable;

/**
 * @author GaoHangHang
 * @date 2018/06/28 17:36
 **/
public class People {
    int num;

    public People() {
    } //默认的无参构造函数，没有进行初始化

    public People(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "People{" +
                "num=" + num +
                '}';
    }
}

class Person extends People implements Serializable {

    private static final long serialVersionUID = 8846183125161998869L;

    String name;
    int age;

    public Person(int num, String name, int age) {
        super(num);   //调用父类中的构造函数

        this.name = name;
        this.age = age;
    }

    public String toString() {
        return super.toString() + "\tname:" + name + "\tage:" + age;
    }
}
