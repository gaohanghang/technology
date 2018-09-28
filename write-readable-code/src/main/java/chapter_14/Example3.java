package main.java.chapter_14;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * 删除无用代码
 *
 * @author: Gao HangHang
 * @date 2018/09/24
 */
public class Example3 {

    public Map<String, String> readData(){
        Map<String, String> result = new HashMap<>();
        result.put("title", i18n("title", "cn"));
        result.put("bannerText", i18n("bannerText", "cn"));
        result.put("copyright", i18n("copyright", "cn"));

        return result;
    }

    public String i18n(String key, String language){
        return "";
    }
}
