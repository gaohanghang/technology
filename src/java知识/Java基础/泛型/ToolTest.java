package java知识.Java基础.泛型;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/08 下午9:07
 */
public class ToolTest {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(23);
        //ls.add("text");
        try {
            Method method = ls.getClass().getDeclaredMethod("add",Object.class);

            method.invoke(ls,"test");
            method.invoke(ls,42.9f);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        for (Object o : ls) {
            System.out.println(o);
        }

    }

}
