package day01.com.atguigu.java8;

public class Test {

    public static void main(String[] args) {
        String s = multi_random_number(8);
        System.out.println(s);
    }

    public static String multi_random_number(int len) {
        StringBuffer rt = new StringBuffer();
        for (int i = 0; i < len; i++) {
            if (i == 1) {
                rt = rt.append((int) (Math.random() * 10 + 1));
            } else {
                rt = rt.append((int) (Math.random() * 10));
            }
        }
        return rt.toString();
    }
}
