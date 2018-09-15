package main.java.chapter_02;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/09/14 下午9:49
 */
public class Example3 {

    private Map<String, Coder> coderMap = new HashMap<>();

    public Example3() {
        coderMap.put("biezhi", new Coder(true));
        coderMap.put("80k", new Coder(false));
    }

    private Coder findCoder(String key) {
        return coderMap.get(key);
    }

    public void before() {
        Coder coder;
        boolean hasGirlFriend = (null != (coder = findCoder("biezhi"))) && coder.hasGirlFriend();
        System.out.println("是否有女朋友：" + hasGirlFriend);
    }

    public void after() {
        Coder coder = this.findCoder("biezhi");
        if (null != coder) {
            System.out.println("是否有女朋友：" + coder.hasGirlFriend());
        }
    }

    public static void main(String[] args) {
        new Example3().before();
        new Example3().after();
    }

}
