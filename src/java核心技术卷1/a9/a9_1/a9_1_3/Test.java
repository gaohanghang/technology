package java核心技术卷1.a9.a9_1.a9_1_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/09 15:55
 */
public class Test {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterator iterator = c.iterator();
        iterator.forEachRemaining(element -> {

        });
    }

    public static <E> boolean contains(Collection<E> c, Object object) {
        for (E element : c)
            if (element.equals(object))
                return true;
        return false;
    }
}
