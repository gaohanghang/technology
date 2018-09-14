package java知识.Java基础.泛型.泛型擦除;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/08 下午6:08
 */
public class Erasure<T extends String> {
    //public class Erasure <T> {
    T object;

    public Erasure(T object) {
        this.object = object;
    }

    public void add(T object) {

    }

}
