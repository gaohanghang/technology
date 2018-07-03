package 基础知识.Java基础.序列化;

import java.io.Serializable;

/**
 * @author GaoHangHang
 * @date 2018/06/28 14:04
 **/
public class Person implements Serializable {

    private static final long serialVersionUID = 434551870086116603L;

    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "name:"+name+"\tage:"+age;
    }
}
