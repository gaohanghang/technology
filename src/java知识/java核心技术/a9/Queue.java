package java知识.java核心技术.a9;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/09 15:38
 */
public interface Queue<E> { // a simplified form of the interface in the standard library
    void add(E element);
    E remove();
    int size();
}
