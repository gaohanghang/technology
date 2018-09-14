package java知识.Java基础.泛型.泛型中值得注意的地方;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description: Java 不能创建具体类型的泛型数组
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/08 下午9:19
 */
public class Main2 {

    public static void main(String[] args) {

        //List<Integer>[] li2 = new ArrayList<Integer>[];
        //List<Boolean> li3 = new ArrayList<Boolean>[];

        List<?>[] lis3 = new ArrayList<?>[10];
        lis3[1] = new ArrayList<>();
        List<?> v = lis3[1];

    }

}
