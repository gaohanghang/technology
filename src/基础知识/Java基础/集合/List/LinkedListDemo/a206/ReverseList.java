package 基础知识.Java基础.集合.List.LinkedListDemo.a206;

/**
 * LeetCode
 * 206.反转单链表
 * @author GaoHangHang
 * @date 2018/07/16 21:54
 **/
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        }
        //初始化pre
        ListNode pre = null;
        while (head!=null){
            //保存next节点
            ListNode tmp = head.next;
            //更改next引用
            head.next = pre;
            //更新pre,head
            pre = head;
            head = tmp;
        }
        return pre;
    }
}
