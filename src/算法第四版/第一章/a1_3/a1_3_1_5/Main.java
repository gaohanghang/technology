package 算法第四版.第一章.a1_3.a1_3_1_5;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

import java.security.PublicKey;

/**
 * @author: Gao HangHang
 * @date 2018/09/20
 */
public class Main {

    public static void main(String[] args) {

    }

    public static int[] readInts(String name) {
        // his class provides methods for reading strings  他的类提供了读取字符串的方法
        // and numbers from standard input, file input, URLs, and sockets.

        In in = new In(name);
        Queue<Integer> q = new Queue<>();

        while (!in.isEmpty())
            q.enqueue(in.readInt());

        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = q.dequeue();
        return a;
    }

}
