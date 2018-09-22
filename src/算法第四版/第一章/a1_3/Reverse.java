package 算法第四版.第一章.a1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


/**
 * @author: Gao HangHang
 * @date 2018/09/20
 */
public class Reverse {

    public static void main(String[] args) {
        // 下压栈
        Stack<Integer> stack;
        stack = new Stack<Integer>();
        //如果不为空
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());

            for (Integer i : stack) {
                StdOut.println(i);
            }
        }
    }

}
