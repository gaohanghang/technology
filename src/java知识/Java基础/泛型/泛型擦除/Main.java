package java知识.Java基础.泛型.泛型擦除;

import java.lang.reflect.Field;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/08 下午6:09
 */
public class Main {

    public static void main(String[] args) {

        Erasure<String> erasure = new Erasure<>("hello");

        Class eclz = erasure.getClass();

        System.out.println("erasure class is:" + eclz.getName());

        Field[] fs = eclz.getDeclaredFields();
        for (Field f : fs) {
            System.out.println("Field name " + f.getName() + " type:" + f.getType().getName());
        }

    }

}
