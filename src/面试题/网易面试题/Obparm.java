package 面试题.网易面试题;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午3:20
 */
// begin
public class Obparm {

    public static void main(String[] args) {

        Obparm o = new Obparm();
        o.amethod();

    }

    public void amethod() {
        int i = 99;
        ValHold v = new ValHold();
        v.i = 30;
        another(v,i);
    }

    public void another(ValHold v,int i) {
        i=0;
        v.i = 20;
        ValHold vh = new ValHold();
        v = vh;
        System.out.println(v.i + " " + i);
    }
}
class ValHold{
    public int i = 10;
}
// end
