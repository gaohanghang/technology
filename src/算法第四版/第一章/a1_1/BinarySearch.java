package 算法第四版.第一章.a1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author GaoHangHang
 * @date 2018/06/27 17:43
 **/
// 代码文件名必须是BinarySearch
/**
 *  The {@code BinarySearch} class provides a static method for binary
 *  searching for an integer in a sorted array of integers.
 *  <p>
 *  The <em>indexOf</em> operations takes logarithmic time in the worst case.
 *  <p>
 *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class BinarySearch {

    // 静态方法
    // key,a 是参数变量
    public static int rank(int key ,int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        // 循环语句
        while (lo<= hi)
        {
            int mid = lo + (hi - lo ) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) hi = mid - 1;
            else return mid;
        }
        // 返回语句
        return -1;
    }

    public static void main(String[] args)
    {
        // 没有返回值，只有副作用
        // 读取多个int值
        // read the integers from a file
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        // 对数组进行排序
        // sort the array
        Arrays.sort(whitelist);

        // 如果输入流中没有剩余的值则返回true，否则返回false
        // read integer key from standard input;print if not int whitelist
        while (!StdIn.isEmpty())
        {
            // 读取一个int类型的值
            int key = StdIn.readInt();
            if (rank(key,whitelist) == -1)
                // 打印一个换行符
                StdOut.println(key);
        }
    }

}
