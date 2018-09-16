package main.java.chapter_08;

/**
 * 避免用 do while 循环
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example4 {

    int hour;

    class Node {
        String name;
        Node   next;
    }

    //    public boolean listHasNode(Node node, String name, int maxLength) {
//        do {
//            if (node.name.equals(name))
//                return true;
//            node = node.next;
//        } while (node != null && --maxLength > 0);
//        return false;
//    }

    public boolean listHasNode(Node node, String name, int maxLength) {
        while (node != null && maxLength-- > 0) {
            if (node.name.equals(name))
                return true;
            node = node.next;
        }
        return false;
    }

}
