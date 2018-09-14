package java知识.Java基础.泛型.通配符;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
    <?> 提供了只读功能，也就是它删减了增加具体类型元素的能力
 */
public class testWildCards {

    public void testWildCards(Collection<?> collection) {

        //collection.add(123);
        //collection.add("hello");
        //collection.add(new Object());

        collection.iterator().next();
        collection.size();

        List<?>  wildlist = new ArrayList<>();
        //wildlist.add(123); // 编译不通过

    }

    public <T> void test(Collection<T> collection){
        collection.add((T) new Integer(12));
        collection.add((T) "123");
    }

}
