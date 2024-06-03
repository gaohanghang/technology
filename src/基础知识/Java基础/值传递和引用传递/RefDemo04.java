package 基础知识.Java基础.值传递和引用传递;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-08-27 15:15
 **/
public class RefDemo04 {

    // 在调用方法时，传递参数可以传递基本数据类型和引用数据类型
    public static void main(String[] args) {
        Person person = new Person(18, "张三");
        System.out.println("调用参数之前：" + person);
        call(person);
        System.out.println("调用参数之后：" + person);
    }

    public static void call(Person i) {
        i  = new Person(20, "李四");
    }

}
