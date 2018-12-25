package 基础知识.Java基础.集合.差集;

import java.util.HashSet;
import java.util.Set;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/08/29 19:53
 */
public class test {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        //交集
        //set1.retainAll(set2);
        //并集
        //set1.addAll(set2);
        //差集
        set1.removeAll(set2);

        //System.out.println("交集是 "+set1);
        //System.out.println("并集是 "+set1);
        System.out.println("差集是 " + set1);
    }
}
