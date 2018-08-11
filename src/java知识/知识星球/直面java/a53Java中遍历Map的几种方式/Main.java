package java知识.知识星球.直面java.a53Java中遍历Map的几种方式;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author GaoHangHang
 * @date 2018/05/23 11:16
 **/
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();


        //方法一 在for-each循环中使用entries来遍历
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){

            System.out.println("Key = "+entry.getKey()+",Value = "+entry.getValue());

        }

        //方法二 在for-each循环中遍历keys或values。

        //遍历map中的键
        for (Integer key : map.keySet()){

            System.out.println("Key = "+key);

        }

        //遍历map中的值
        for (Integer value : map.values()) {

            System.out.println("Value = "+ value);

        }

        //方法三 使用Iterator遍历
        //1.使用泛型

       /* Iterator<Map.Entry<Integer,Integer>> entries = map.entrySet().iterator();

        while (entries.hasNext()){

            Map.Entry<Integer,Integer> entry = entries.next();

            System.out.println("Key = "+ entry.getKey() + ",Value="+entry.getValue());
        }*/

        //不使用泛型

        Iterator entries = map.entrySet().iterator();

        while (entries.hasNext()){

            Map.Entry entry = (Map.Entry) entries.next();

            Integer key = (Integer) entry.getKey();

            Integer value = (Integer) entry.getValue();

            System.out.println("Key= "+ key + ",Value="+value);

        }

        //方法四、通过键找值遍历（效率低）

        for (Integer key : map.keySet()){

            Integer value = map.get(key);

            System.out.println("Key = " + key +",Value = "+ value);

        }

    }
}
