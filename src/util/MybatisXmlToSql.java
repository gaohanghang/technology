package util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-09-25 17:20
 **/
public class MybatisXmlToSql {

    public static HashMap init() {
        HashMap<String, String> map = new HashMap();
        map.put("<", "&lt;");
        map.put(">", "&gt;");
        return map;
    }

    public static void main(String[] args) {
        HashMap map = init();
        String s= "SELECT\n" +
                "\t* \n" +
                "FROM\n" +
                "\t( SELECT * FROM collision_comparison_result A, t_chat_contact_msg b WHERE A.data_id \n" +
                "= b.ID  AND A.case_id = '8a8a82e67496192e01749631238e0000' AND A.match_value = '地址' and ( ( account = 'lccscl' AND friend_account = 'yundakuaidiV' ) OR ( account = 'yundakuaidiV' AND friend_account = 'lccscl' ) ) ORDER BY mail_send_time ) AS msg \n" +
                "WHERE\n" +
                "\tmail_send_time <= : searchDate \n" +
                "\tLIMIT \n" +
                "\t";
        String parse = parse(s, map);
        System.out.println(parse);

        //System.out.println("<".replace("<", "nnn"));
    }

    public static String parse(String str, HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str.replace(entry.getKey(), entry.getValue());
        }
        return str;
    }

}
