package java知识.Java基础.泛型.通配符;

import java.util.Collection;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/08 下午5:35
 */
public class Test {

    public static void main(String[] args) {

    }

    public void testSub(Collection<? extends Base> para) {
        //para.add(new Sub());
        //para.add(new Base());
    }

    public void testSuper(Collection<? super Sub> para) {
        para.add(new Sub());//编译通过
        //para.add(new Base());//编译不通过
    }

}
