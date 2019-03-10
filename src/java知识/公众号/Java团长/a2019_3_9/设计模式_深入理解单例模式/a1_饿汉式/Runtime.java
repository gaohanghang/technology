package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a1_饿汉式;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:32
 */
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return  the <code>Runtime</code> object associated with the current
     *          Java application.
     */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /**
     * Don't let anyone else instantiate this class
     */
    private Runtime() {
    }
}
