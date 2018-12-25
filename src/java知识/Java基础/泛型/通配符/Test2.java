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
 * @date 2018/09/08 下午5:58
 */
/*
   E 类型是 T 类型的子类，显然这种情况类型参数更适合。
 */
public class Test2<T, E extends T> {
    T value1;
    E value2;

    public <D, S extends D> void test(D d, S s) {

    }

    // 通配符和类型参数可以一起使用
    public <T> void test(T t, Collection<? extends T> collection) {

    }

    // 如果一个方法的返回类型依赖于参数的类型，那么通配符也无能为力。
    public T test1(T t) {
        return value1;
    }

}
