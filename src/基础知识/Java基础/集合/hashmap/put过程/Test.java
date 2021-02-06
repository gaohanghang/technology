package 基础知识.Java基础.集合.hashmap.put过程;

/**
 * @Description  https://blog.csdn.net/qq_38182963/article/details/78942764
 * @Author Gao Hang Hang
 * @Date 2021-02-06 16:57
 **/
public class Test {

    public static void main(String[] args) {
        // 1. 初始化
        HashMap<String, Integer> hashMap = new HashMap<>(2);
        // 2. put 元素
        hashMap.put("one", 1);
        // 3. get 元素
        Integer one = hashMap.get("one");
        System.out.println(one);

    }

}
