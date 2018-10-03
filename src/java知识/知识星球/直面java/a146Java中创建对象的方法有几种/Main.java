package java知识.知识星球.直面java.a146Java中创建对象的方法有几种;

import java.lang.reflect.Constructor;

/**
 * @author: Gao HangHang
 * @date 2018/10/01
 */
public class Main {

    public static void main(String[] args) throws Exception {

        // 一、使用new关键字
        //User user = new User();

        // 二、使用反射机制
        // 运用反射手段，调用Java.lang.Class或者java.lang.reflect.Constructor类的newInstance()实例方法。

        // 1 使用Class类的newInstance方法

        // 创建方法1
        //User user = (User)Class.forName("根路径.User").newInstance();
        // 创建方法2（用这个最好）
        //User user = User.class.newInstance();

        // 2 使用Constructor类的newInstance方法
        //和Class类的newInstance方法很像， java.lang.reflect.Constructor类里也有一个newInstance方法可以创建对象。我们可以通过这个newInstance方法调用有参数的和私有的构造函数。
        Constructor<User> constructor = User.class.getConstructor();
        User user = constructor.newInstance();
        //这两种newInstance方法就是大家所说的反射。事实上Class的newInstance方法内部调用Constructor的newInstance方法。

        //三、使用clone方法
        //无论何时我们调用一个对象的clone方法，jvm就会创建一个新的对象，将前面对象的内容全部拷贝进去。用clone方法创建对象并不会调用任何构造函数。
        //要使用clone方法，我们需要先实现Cloneable接口并实现其定义的clone方法。

        //四、使用反序列化
        //当我们序列化和反序列化一个对象，jvm会给我们创建一个单独的对象。在反序列化时，jvm创建对象并不会调用任何构造函数。
        //为了反序列化一个对象，我们需要让我们的类实现Serializable接口。
    }

}
