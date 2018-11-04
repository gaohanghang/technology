package Fastjson;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: Gao HangHang
 * @date 2018/10/26
 */
public class MainTest {

    public static void main(String[] args) {
        String json = "{\"code\":0,\"message\":\"没有查询到数据\",\"data\":null,\"taskId\":\"0-bb03193f-ed1f-4d32-8351-6538d329b26e\",\"time\":\"2017-09-2210:11:30\"}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        Integer code = jsonObject.getInteger("code");
        System.out.println();
    }

}
