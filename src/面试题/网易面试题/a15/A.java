package 面试题.网易面试题.a15;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午4:25
 */
public class A {

    static A test = new A();
    static int a;
    static int b = 0;

    static {
        System.out.println(A.a + " " + A.b);
    }

    public A() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        System.out.println(A.a + " " + A.b);
    }

}
