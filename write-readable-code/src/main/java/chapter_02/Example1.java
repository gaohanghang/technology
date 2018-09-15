package main.java.chapter_02;



import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/09/14 下午9:14
 */
public class Example1 {

    Queue<Node> nodes = new LinkedList<Node>();

    public Example1() {
        nodes.add(new Node());
        nodes.add(new Node());
    }

    public void snippet1() {
        for (Node node = nodes.peek(); node !=null; node = node.next()) {
            System.out.println(node.data());
        }
    }

    public void snippet2() {
        Node node = nodes.peek();
        if (node == null) return;
        while (node.next()!=null) {
            System.out.println(node.data());
            node = node.next();
        }
        if (node != null) System.out.println(node.data());
    }

}
