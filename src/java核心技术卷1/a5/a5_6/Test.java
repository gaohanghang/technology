package java核心技术卷1.a5.a5_6;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 22:41
 */
public class Test {
    public static void main(String[] args) {
        Size s = Enum.valueOf(Size.class, "SMALL");
        System.out.println(s);

        System.out.println(Size.SMALL.toString());

        Size[] values = Size.values();
        System.out.println(values);

        System.out.println(Size.MEDIUM.ordinal());
    }
}
