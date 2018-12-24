package java知识.java核心技术.a6.a6_2.a6_2_2;

import org.apache.jasper.tagplugins.jstl.core.If;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: Comparator
 * @author: Gao Hang Hang
 * @date 2018/12/24 16:14
 */
public class Test {
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();
        //if (comp.compare(words[i], words[j]) > 0);

        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LengthComparator());

        System.out.println(Arrays.toString(friends));
    }
}
