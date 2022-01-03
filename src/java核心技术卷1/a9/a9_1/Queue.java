package java核心技术卷1.a9.a9_1;

public interface Queue<E> { // a simplified from the interface in the standard library
    void add(E element);
    E remove();
    int size();
}
