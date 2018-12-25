package 基础知识.Java基础.集合.List.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GaoHangHang
 * @date 2018/07/16 13:12
 **/
public class RandomAccessTimeTest {

    //使用for循环遍历
    public static long traverseByLoop(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //使用迭代器遍历
    public static long traverseByIterator(List list) {
        Iterator iterator = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        //加入数据
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 30000; i++) {
            arrayList.add("" + i);
        }
        long loopTime = RandomAccessTimeTest.traverseByLoop(arrayList);
        long iteratorTime = RandomAccessTimeTest.traverseByIterator(arrayList);
        System.out.println("ArrayList:");
        System.out.println("for循环遍历时间：" + loopTime);
        System.out.println("迭代器遍历时间：" + iteratorTime);

        List<String> linkedList = new LinkedList<>();
        //加入数据
        for (int i = 0; i < 30000; i++) {
            linkedList.add("" + i);
        }
        loopTime = RandomAccessTimeTest.traverseByLoop(linkedList);
        iteratorTime = RandomAccessTimeTest.traverseByIterator(linkedList);
        System.out.println("LinkedList:");
        System.out.println("for遍历时间：" + loopTime);
        System.out.println("迭代器遍历时间：" + iteratorTime);
    }
}
