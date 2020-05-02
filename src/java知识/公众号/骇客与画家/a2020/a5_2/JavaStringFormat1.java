package java知识.公众号.骇客与画家.a2020.a5_2;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-05-02 02:45
 **/
public class JavaStringFormat1 {

    public static void main(String[] args) {

        String sql = String.format("select * from user where name like '%%s'","僧");
        System.out.println(sql);

    }

}
