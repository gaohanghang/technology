package java核心技术卷1.a9.a9_2具体的集合.a9_2_5队列与双端队列;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/09 15:38
 */
public interface Queue<E> { // a simplified form of the interface in the standard library
    void add(E element);
    E remove();
    int size();
}
