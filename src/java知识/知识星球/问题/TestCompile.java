package java知识.知识星球.问题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description:
 * @date 2018/11/10 12:31 PM
 */
public class TestCompile {
    public static void main(String[] args) {
        //test(new ArrayList<>());
    }

    public static void test(Collection<Object> collection) {
        System.out.println("Collection");
    }

    public static void test(List<?> collection) {
        System.out.println("List");
    }
}
