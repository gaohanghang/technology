package java知识.java核心技术.a9.a9_1;

public interface Queue<E> { // a simplified from the interface in the standard library
    void add(E element);
    E remove();
    int size();
}
