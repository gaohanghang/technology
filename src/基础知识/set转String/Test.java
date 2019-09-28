package 基础知识.set转String;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-12 19:11
 **/
public class Test {

    private static void selectAndRemove(Set<String> strings) {
        String[] strings1 = strings.toArray(new String[0]);
        for (String s : strings1) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("1");
        strings.add("2");
        selectAndRemove(strings);
    }
}
