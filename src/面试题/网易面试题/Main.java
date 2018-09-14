package 面试题.网易面试题;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午3:28
 */
public class Main {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2 ? "" : "1");
        String str3 = new String("hello").intern();
        System.out.println(str1 == str3);

    }

}
