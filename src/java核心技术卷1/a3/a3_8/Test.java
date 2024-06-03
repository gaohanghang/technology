package java核心技术卷1.a3.a3_8;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 2:25 PM
 */
public class Test {
    public static void main(String[] args) {
        int n;
        {
            int k;
            //int n; // Error--can't redefine n in inner block
        } // k is only defined up to here
    }
}
