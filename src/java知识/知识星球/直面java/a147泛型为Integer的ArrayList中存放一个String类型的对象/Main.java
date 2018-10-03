package java知识.知识星球.直面java.a147泛型为Integer的ArrayList中存放一个String类型的对象;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型为Integer的ArrayList中存放一个String类型的对象
 *
 * @author: Gao HangHang
 * @date 2018/10/01
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 利用发射机制动态调用 list 对象的add方法，绕过类型检查
        Class<? extends List> listClass = list.getClass();
        try {
            Method addMethod = listClass.getMethod("add", Object.class);
            addMethod.invoke(list, "kbrx93");
            System.out.println("kbrx93".equals(list.get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
