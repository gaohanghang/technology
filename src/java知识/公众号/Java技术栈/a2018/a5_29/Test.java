package java知识.公众号.Java技术栈.a2018.a5_29;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created by GaoHangHang 2018-05-30 13:07
 **/
public class Test {
    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));*/

        /*Set<String> set = new HashSet<>(Arrays.asList(arr));
        return set.contains(targetValue);*/

       /* ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);*/

       /*ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        for (String s : list) {
            if (s.equals("a")){
                list.remove(s);
                break;
            }
        }
        System.out.println(list);*/

        /**
         * 正确的在遍历过程中删除元素的方法应该是使用Iterator：
         */
       /* ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String s = iter.next();

            if (s.equals("a")){
                iter.remove();
            }
        }*/

       /*List<String> list = new ArrayList<>();
       add(list,10);
       String  s = list.get(0);*/

        /**
         * 八可变与不可变
         *
         * 连接大量的字符串，应该选用可变对象。
         */
       /* String result="";
        for (String s:arr){
            result = result + s;
        }*/
    }

    public static void add(List<String> list, Object o) {
        list.add(o.toString());
    }

}
