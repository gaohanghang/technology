package java知识.公众号.骇客与画家.a2020.a3_30;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-03-30 00:01
 **/
public class Test {

    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("1");
        arrayList1.add("2");
        for (String s : arrayList1) {
            if ("1".equals(s)) {
                arrayList1.remove(s);
            }
            List<String> arrayList2 = new ArrayList<String>();
            arrayList2.add("2");
            arrayList2.add("1");
            for (String string : arrayList2) {
                if ("1".equals(string)) {
                    arrayList2.remove(string);
                }
            }
        }
    }

}
