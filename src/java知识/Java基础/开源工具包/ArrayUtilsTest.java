package java知识.Java基础.开源工具包;

import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;

/**
 * @author GaoHangHang
 * @date 2018/06/06 16:19
 **/
public class ArrayUtilsTest {
    public static void main(String[] args) {
        // 合并两个数组 （也可以理解为添加多个数据，后面的add是添加单个数据）
        int[] a = new int[] {1,3,5};

        int[] b = new int[] {2,4};

        int[] ints = ArrayUtils.addAll(a, b);

        //结果{1,3,5,2,4}


        //这两种都是不考虑为null的情况下

        //这个方法也是addAll底层所采用的方法
        int[] c = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);

        //这个就是比较普通了，想到比较多的吧
        int j = 0;
        for (int i = 0; i < c.length; i++) {
            if (i<a.length){
                c[i] = a[i];
            }else {
                c[i] = b[j];
                j++;
            }
        }


        /*
            既然有添加多个数据当然有添加单个数据
         */
        // 添加一个数据到数组
        ArrayUtils.add(new int[] {1,3,5},4 );
        // 结果 {1,3,5,4}

    }
}
