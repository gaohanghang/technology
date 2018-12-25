package 基础知识.Java基础.集合.List.List全了解;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/08/31 20:08
 */
public class ListArrayDemo {
    public static void main(String[] args) {
        arrayToList();
        listToArray();
        arrayToList1();
    }

    private static void arrayToList() {
        String[] arr = {"a", "b", "c"};
        List<String> lists = Arrays.asList(arr);
        for (String s : lists) {
            System.out.println(s);
        }
    }

    private static void arrayToList1() {
        String[] arr = {"a", "b", "c"};
        List<String> lists = new ArrayList<>(Arrays.asList(arr));
        lists.add("d");
        for (String list : lists) {
            System.out.println(list);
        }
    }

    private static void listToArray() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String[] arr = list.toArray(new String[]{});
        System.out.println(list.toString());
    }
}
