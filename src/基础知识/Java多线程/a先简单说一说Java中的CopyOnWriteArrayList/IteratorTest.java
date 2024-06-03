package 基础知识.Java多线程.a先简单说一说Java中的CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// https://juejin.cn/post/6844903576339218440
public class IteratorTest {

	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {

		list.add("1");
		list.add("2");
		list.add("3");

		Iterator<String> iter = list.iterator();

		//我当前正在迭代集合（这里模拟并发中读取某一list的场景）
		while (iter.hasNext()) {

			System.err.println(iter.next());

		}

		System.err.println(Arrays.toString(list.toArray()));
	}
}
