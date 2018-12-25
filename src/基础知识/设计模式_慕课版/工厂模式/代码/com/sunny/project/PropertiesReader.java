package 基础知识.设计模式_慕课版.工厂模式.代码.com.sunny.project;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件的读取工具
 *
 * @author ghang
 */
public class PropertiesReader {

    public Map<String, String> getProperties() {

        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        try {

            // getClass获取到的是Class对象，getResourceAsStream方法是Class中的方法
            InputStream in = getClass().getResourceAsStream("type.properties");
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key, property);
//                System.out.println(key+" "+property);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
