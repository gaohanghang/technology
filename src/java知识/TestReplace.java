package java知识;

/**
 * @author GaoHangHang
 * @date 2018/08/21 15:35
 **/
public class TestReplace {
    public static void main(String[] args) {
        String icode = "169219cb03014a06b2e6138babbf7385";
        String url = "http://openservice.ctrip.com/openservice/serviceproxy.ashx?AID=${aid}&SID=${sid}&ICODE=#[ICODE]&UUID=${uuid}&Token=#[TOKEN]&mode=1&format=JSON";
        String newUrl = "http://openservice.ctrip.com/openservice/serviceproxy.ashx?AID=${aid}&SID=${sid}&ICODE=#[ICODE]&UUID=${uuid}&Token=#[TOKEN]&mode=1&format=JSON".replaceAll("\\#\\[ICODE\\]", icode).replaceAll("\\#\\[TOKEN\\]", "dddddddd");
        System.out.println(newUrl);
    }
}
