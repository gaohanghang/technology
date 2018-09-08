package java知识.Java基础.泛型.通配符;

import java.util.Collection;

public class testWildCards {

    public void testWildCards(Collection<?> collection) {

        //collection.add(123);
        //collection.add("hello");
        //collection.add(new Object());

        collection.iterator().next();
        collection.size();

    }

}
