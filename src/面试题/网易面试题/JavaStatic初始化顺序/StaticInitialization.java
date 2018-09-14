package 面试题.网易面试题.JavaStatic初始化顺序;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午5:38
 */
public class StaticInitialization {

    public static void main(String[] args) {

    }

    public void aMetod(A a1, A a2) {
        synchronized (a1) {
            //doSth();
            synchronized (a2) {
                //doSth2();
            }
        }
    }



}
