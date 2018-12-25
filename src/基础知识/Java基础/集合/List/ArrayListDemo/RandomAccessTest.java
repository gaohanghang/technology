package 基础知识.Java基础.集合.List.ArrayListDemo;

import java.util.*;

/**
 * @author GaoHangHang
 * @date 2018/07/16 12:14
 **/
public class RandomAccessTest {

    public static void traverse(List list) {
        if (list instanceof RandomAccess) {
            System.out.println("实现了RandomAccess接口，不使用迭代器");

            // 如果实现了RandomAccess接口，比如ArrayList,就直接循环遍历
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("没实现RandomAccess接口，使用迭代器");

            // 如果没有实现RandomAccess接口，比如linkedList则使用迭代器进行遍历
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        //实现了RandomAccess接口，使用循环遍历
        traverse(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("c");
        linkedList.add("d");
        //没有实现RandomAccess接口，因此使用迭代器遍历
        traverse(linkedList);
    }
}
