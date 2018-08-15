package 数组和list相互转换;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author GaoHangHang
 * @date 2018/08/11 19:53
 **/
public class Main {

    public static void main(String[] args) {
        /**
         * 转换数组为List
         *
         */
        // 1. 使用Stream中的Collector收集器
        String[] arrays = new String[]{"a","b","c"};
        List<String> listStrings = Stream.of(arrays).collect(Collectors.toList());
        // 2. 使用java.util.Arrays工具类中的asList()方法（这个不是Java8中新增的内容）:
        String[] arrays2 = new String[]{"a", "b", "c"};
        List<String> listStrings2 = Arrays.asList(arrays2);

        /**
         * 转换List为数组
         */
        // 1. 使用Stream:
        String[] ss = listStrings.stream().toArray(String[]::new);
        // 2. 使用List中的toArray()方法
        String[] ss2 = listStrings2.toArray(new String[listStrings2.size()]);
    }

}
