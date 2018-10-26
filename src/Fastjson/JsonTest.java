package Fastjson;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: Gao HangHang
 * @date 2018/10/25
 */
public class JsonTest {
    public static void main(String[] args) {
        // json串
        String str = "{\"id\":\"75\",\"shoppingCartItemList\":[{\"id\":\"407\",\"num\":\"10\"}]}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        // 获取key为shoppingCartItemList的值
        String r = jsonObject.getString("shoppingCartItemList");
        System.out.println(r);
    }
}
