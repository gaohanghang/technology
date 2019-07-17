package java知识.公众号.占小狼的博客.a2019.a7_11.chain_of_responsibility;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 18:58
 **/
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }

    public T handler(T input) {
        T r = handleWork(input);
        if (successor != null) {
            return successor.handler(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
