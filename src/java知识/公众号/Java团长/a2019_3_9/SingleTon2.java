package java知识.公众号.Java团长.a2019_3_9;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:08
 */
public class SingleTon2 {

    // 私有化构造方法
    private SingleTon2() {
    }

    private static volatile SingleTon2 singleTon = null;

    public static SingleTon2 getInstance() {

        // 第一次校验
        if (singleTon == null) {
            synchronized (SingleTon2.class) {
                // 第二次校验
                if (singleTon == null) {
                    singleTon = new SingleTon2();
                }
            }
        }
        return singleTon;
    }
}
