package java知识.java核心技术.a9.a9_1_2;

import java.util.LinkedList;
import java.util.function.Consumer;

public interface Iterator<E> {
    E next();
    boolean hasNext();
    void remove();

    default void forEachRemaining(Consumer<? super E> action) {

    }
}
