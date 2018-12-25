package 面试题.网易面试题;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午3:47
 */
public class B extends A {

    B b;

    public B(String s) {
        System.out.println(3);
        this.s = s;
        b = new B();
    }

    public B() {
        System.out.println(4);
    }

}
